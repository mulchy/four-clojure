(ns four-clojure.seventy-test
  (:require [four-clojure.seventy :refer :all]
            [expectations :refer [expect]]))

(expect ["a" "day" "Have" "nice"]
   (split-and-sort  "Have a nice day."))

(expect ["a" "Clojure" "fun" "is" "language"]
   (split-and-sort  "Clojure is a fun language!"))

(expect ["fall" "follies" "foolish" "Fools" "for"]
   (split-and-sort  "Fools fall for foolish follies."))
