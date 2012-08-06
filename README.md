# str-helpers

Few helper functions for Clojure strings.

## Usage

``` clojure
(use 'str-helpers)
``` 


dasherize - Turns underscores and whitespaces into dashes.
``` clojure
(h/dasherize "hello world")  ; => "hello-world"
(h/dasherize "hello_world")  ; => "hello-world"
```


underscore - Turns dashes and whitespaces into underscores.
``` clojure
(h/underscore "hello-world") ; => "hello_world"
(h/underscore "hello world") ; => "hello_world"
```


humanize - Capitalizes the first word and turns underscores and dashes into spaces.
``` clojure
(h/humanize "hello-world")   ; => "Hello world"
(h/humanize "hello_world")   ; => "Hello world"
```

## License

Copyright (C) 2012 edtsech

Distributed under the Eclipse Public License, the same as Clojure.
