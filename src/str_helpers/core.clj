(ns str-helpers.core
  (:require [clojure.string :as string]))

(defn humanize [s]
  (-> s
    (string/replace #"-" " ")
    (string/replace #"_" " ")))

(defn capitalize [s]
  (-> s
    (humanize)
    (string/capitalize)))

(defn underscore [s]
  (-> s
    (string/replace #"-" "_")
    (string/replace #" " "_")))

(defn dasherize [s]
  (-> s
    (string/replace #" " "-")
    (string/replace #"_" "-")))
