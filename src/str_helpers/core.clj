(ns str-helpers.core
  (:require [clojure.string :as string]))

(defn ^String humanize
  "Capitalizes the first word and turns underscores and dashes into spaces."
  [^CharSequence s]
  (-> s
    (string/replace #"-" " ")
    (string/replace #"_" " ")
    (string/capitalize)))

(defn ^String underscore
  "Turns dashes and whitespaces into underscores."
  [^CharSequence s]
  (-> s
    (string/replace #"-" "_")
    (string/replace #" " "_")))

(defn ^String dasherize
  "Turns underscores and whitespaces into dashes."
  [^CharSequence s]
  (-> s
    (string/replace #" " "-")
    (string/replace #"_" "-")))
