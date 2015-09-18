(ns four-clojure.sixty-seven-test
  (:require [expectations :refer [expect]]
            [four-clojure.sixty-seven :refer :all]))

(expect [2 3] (first-n-primes 2))
(expect [2 3 5 7 11] (first-n-primes 5))
(expect 541 (last (first-n-primes 100)))
