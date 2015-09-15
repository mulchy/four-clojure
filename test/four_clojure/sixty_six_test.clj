(ns four-clojure.sixty-six-test
  (:require [expectations :refer [expect]]
            [four-clojure.sixty-six :refer :all]))

(expect
 2
 (gcd 2 4))

(expect
 5
 (gcd 10 5))

(expect
 1
 (gcd 5 7))

(expect
 33
 (gcd 1023 858))
