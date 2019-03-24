module App exposing (..)

import Html exposing (..)
import Html.Attributes exposing (..)
import Html.Events exposing (..)
import Array

type alias Card =
  { front : String
  , back : String }

type alias Cards = Array.Array Card

type alias Model =
  { reveal : Bool
  , activeCard : Int
  , cards : Cards }

view : Model -> Html Msg
view model =
  section [ class "section" ]
          [
            div [ class "container is-fluid" ]
                [
                  div [ class "columns" ]
                      [
                        div [ class "column is-2" ]
                            [
                              div [ class "has-text-centered" ]
                                  [
                                    button [ class "button", onClick PrevCard ] [ text " << " ]
                                  , button [ class "button", onClick NextCard ] [ text " >> " ]
                                  , button [ class "button", onClick Flipcard ] [ text "flip" ]
                                  ]
                            ]
                      , div [ class "column is-7 has-text-centered" ] (renderCard model)
                      , div [ class "column is-3" ] []
                      ]
                , div [ class "columns" ]
                      [
                        div [ class "column is-2" ] []
                      , div [ class "column is-7 has-text-centered notification", contenteditable True ]
                            [ text "Elm flip card demo" ]
                      , div [ class "column is-3" ] []
                      ]
                ]
    ]

type Msg
  = Flipcard
  | NextCard
  | PrevCard

getActiveCard : Model -> Card
getActiveCard model = Array.get model.activeCard model.cards |> Maybe.withDefault (Card "" "")

renderCard : Model -> List (Html Msg)
renderCard model =
  let
    totalCards = Array.length model.cards
    currentCard = if (totalCards == 0) then 0 else model.activeCard + 1
    card = getActiveCard model
    frontStyle =
      case model.reveal of
        True -> "none"
        False -> ""
    backStyle =
      case model.reveal of
        True -> ""
        False -> "none"
    flipperStyle =
      case model.reveal of
        True -> "flip"
        False -> ""
  in
    [
      text ("Card " ++ toString currentCard ++ " of " ++ toString totalCards)
      , div [ class ("card flip-container " ++ flipperStyle) ]
            [
              div [ class "flipper" ]
                  [
                    div [ class "front has-text-grey", style [ ("display", frontStyle) ] ]
                        [
                          div [ contenteditable True ] [ text card.front ]
                        ]
                  , div [ class "back has-text-grey", style [ ("display", backStyle) ] ]
                        [
                          div [ contenteditable True ] [ text card.back ]
                        ]
                  ]
            ]
    ]

update : Msg -> Model -> ( Model, Cmd Msg )
update msg model =
  case msg of
    Flipcard ->
      let
        reveal =
          case model.reveal of
            True -> False
            False -> True
      in
        ( { model | reveal = reveal }, Cmd.none )

    NextCard ->
      let
        totalCards = Array.length model.cards
        maxCardIndex = totalCards - 1
        newActiveCard = if (model.activeCard < maxCardIndex) then model.activeCard + 1 else maxCardIndex
      in
        ( { model | activeCard = newActiveCard, reveal = False }, Cmd.none )

    PrevCard ->
      let
        totalCards = Array.length model.cards
        newActiveCard = if (model.activeCard > 0) then model.activeCard - 1 else 0
      in
        ( { model | activeCard = newActiveCard, reveal = False }, Cmd.none )

init : ( Model, Cmd Msg )
init =
  let
    card1 = Card "card 1" "back 1"
    card2 = Card "Hello world!" "Hello again"
    card3 = Card "Day" "Night"
    cards = Array.fromList [ card1, card2, card3 ]
  in
    ( Model True 0 cards, Cmd.none )

main : Program Never Model Msg
main =  Html.program
        { init = init
        , update = update
        , subscriptions = \_ -> Sub.none
        , view = view }

