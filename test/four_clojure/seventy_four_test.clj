(ns four-clojure.seventy-four-test
  (:require [expectations :refer [expect]]
            [four-clojure.seventy-four :refer [filter-squares]]))

(expect (filter-squares "4,5,6,7,8,9") "4,9")

(expect (filter-squares "15,16,25,36,37") "16,25,36")
