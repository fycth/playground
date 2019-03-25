ELM_SOURCES = $(wildcard *.elm) $(wildcard src/elm/**/*.elm)

build:
		elm-make --yes --output target/js/app.js src/elm/App.elm
		cp -r src/html/* target/

clean:
		rm -rf target/*

test:
		elm test
