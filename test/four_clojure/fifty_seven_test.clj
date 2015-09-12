(ns four-clojure.fifty-seven-test
  (:require [expectations :refer [expect]]
            [four-clojure.fifty-seven :refer :all]))

(expect [3 2 1] ((my-comp rest reverse) [1 2 3 4]))
(expect 5 ((my-comp (partial + 3) second) [1 2 3 4]))
(expect true ((my-comp zero? #(mod % 8) +) 3 5 7 9))
(expect "HELLO" ((my-comp #(.toUpperCase %) #(apply str %) take) 5 "hello world"))
