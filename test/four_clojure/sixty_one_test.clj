(ns four-clojure.sixty-one-test
  (:require [expectations :refer [expect]]
            [four-clojure.sixty-one :refer :all]))

(expect (make-map [:a :b :c] [1 2 3]) {:a 1, :b 2, :c 3})
(expect (make-map [1 2 3 4] ["one" "two" "three"]) {1 "one", 2 "two", 3 "three"})
(expect (make-map [:foo :bar] ["foo" "bar" "baz"]) {:foo "foo", :bar "bar"})
