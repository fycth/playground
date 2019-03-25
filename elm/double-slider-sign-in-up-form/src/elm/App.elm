module App exposing (..)

import Html exposing (..)
import Html.Attributes exposing (..)
import Html.Events exposing (..)
import Array

type alias Model = { rightPanelActive : Bool }

renderContainerStyle : Bool -> String
renderContainerStyle rightPanelActive =
  case rightPanelActive of
    False -> "container"
    True -> "container right-panel-active"

view : Model -> Html Msg
view model =
  section [ class "section" ]
  [
    div [ class (renderContainerStyle model.rightPanelActive), id "container" ]
    [
      div [ class "form-container sign-up-container" ]
      [
        Html.form [ action "#" ]
        [
          h1 [] [ text "Create Account" ]
        , div [ class "social-container" ]
          [
            a [ href "#", class "social" ] [ i [ class "fab fa-facebook-f" ] [] ]
          , a [ href "#", class "social" ] [ i [ class "fab fa-google-plus-g" ] [] ]
          , a [ href "#", class "social" ] [ i [ class "fab fa-linkedin-in" ] [] ]
          ]
        , span [] [ text "or use your email for registration" ]
        , input [ type_ "text", placeholder "Name" ] []
        , input [ type_ "email", placeholder "Email" ] []
        , input [ type_ "password", placeholder "Password" ] []
        , button [] [ text "Sign Up" ]
        ]
      ]
    , div [ class "form-container sign-in-container" ]
      [
        Html.form [ action "#" ]
        [
          h1 [] [ text "Sign in" ]
        , div [ class "social-container" ]
          [
            a [ href "#", class "social" ] [ i [ class "fab fa-facebook-f" ] [] ]
          , a [ href "#", class "social" ] [ i [ class "fab fa-google-plus-g" ] [] ]
          , a [ href "#", class "social" ] [ i [ class "fab fa-linkedin-in" ] [] ]
          ]
        , span [] [ text "or use your account" ]
        , input [ type_ "email", placeholder "Email" ] []
        , input [ type_ "password", placeholder "Password" ] []
        , a [ href "#" ] [ text "Forgot your password?" ]
        , button [] [ text "Sign In" ]
        ]
      ]
    , div [ class "overlay-container" ]
      [
        div [ class "overlay" ]
        [
          div [ class "overlay-panel overlay-left" ]
          [
            h1 [] [ text "Welcome Back!" ]
          , p [] [ text "To keep connected with us please login with your personal info" ]
          , button [ class "ghost", id "signIn", onClick SignInButton ] [ text "Sign In" ]
          ]
        , div [ class "overlay-panel overlay-right" ]
          [
            h1 [] [ text "Hello, Friend!" ]
          , p [] [ text "Enter your personal details and start journey with us" ]
          , button [ class "ghost", id "signUp", onClick SignUpButton ] [ text "Sign Up" ]
          ]
        ]
      ]
    ]
  ]

type Msg
  = SignUpButton
  | SignInButton

update : Msg -> Model -> ( Model, Cmd Msg )
update msg model =
  case msg of
    SignUpButton ->
      ( { model | rightPanelActive = True }, Cmd.none )

    SignInButton ->
      ( { model | rightPanelActive = False }, Cmd.none )

init : ( Model, Cmd Msg )
init = ( Model False, Cmd.none )

main : Program Never Model Msg
main =  Html.program
        { init = init
        , update = update
        , subscriptions = \_ -> Sub.none
        , view = view }

