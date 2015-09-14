(ns four-clojure.fifty-eight-test
  (:require [expectations :refer [expect]]
            [four-clojure.fifty-eight :refer :all]))

(expect [21 6 1] ((my-juxt + max min) 2 3 5 1 6 4))
(expect ["HELLO" 5] ((my-juxt #(.toUpperCase %) count) "hello"))
(expect [2 6 4] ((my-juxt :a :c :b) {:a 2, :b 4, :c 6, :d 8 :e 10}))
