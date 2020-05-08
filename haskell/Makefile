SRC := src
BIN := bin

SOURCES := $(wildcard $(SRC)/*.hs)
OBJECTS := $(patsubst $(SRC)/%.hs, $(BIN)/%, $(SOURCES))

all: $(OBJECTS)

$(BIN)/%: $(SRC)/%.hs
	ghc -o $@ $<

clean:
	rm $(OBJECTS)

