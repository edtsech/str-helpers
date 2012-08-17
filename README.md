# str-helpers

Few helper functions for strings in Clojure.

## Usage

``` clojure
(use 'str-helpers)
``` 


dasherize - Turns underscores and whitespaces into dashes.
``` clojure
(dasherize "hello world")  ; => "hello-world"
(dasherize "hello_world")  ; => "hello-world"
```


underscore - Turns dashes and whitespaces into underscores.
``` clojure
(underscore "hello-world") ; => "hello_world"
(underscore "hello world") ; => "hello_world"
```


humanize - Capitalizes the first word and turns underscores and dashes into spaces.
``` clojure
(humanize "hello-world")   ; => "Hello world"
(humanize "hello_world")   ; => "Hello world"
```

## License

Copyright (C) 2012 edtsech

Distributed under the Eclipse Public License, the same as Clojure.
