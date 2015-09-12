(ns four-clojure.fifty-seven-test
  (:require [expectations
             four-cloj]))

(excpect [3 2 1] ((__ rest reverse) [1 2 3 4]))
