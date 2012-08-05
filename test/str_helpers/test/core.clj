(ns str-helpers.test.core
  (:use [str-helpers.core])
  (:use [clojure.test]))

(deftest humanize-test
         (is (= "hello world" (humanize "hello-world")))
         (is (= "hello world" (humanize "hello_world"))))

(deftest capitalize-test
         (is (= "Hello world" (capitalize "hello_world")))
         (is (= "Hello world" (capitalize "hello-world"))))

(deftest underscore-test
         (is (= "hello_world" (underscore "hello world")))
         (is (= "hello_world" (underscore "hello-world"))))

(deftest dasherize-test
         (is (= "hello-world" (dasherize "hello world")))
         (is (= "hello-world" (dasherize "hello_world"))))
