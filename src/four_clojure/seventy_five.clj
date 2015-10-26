(ns four-clojure.seventy-five
  (:require [four-clojure.sixty-six :refer [gcd]]))

(defn totient [x]
  (if (= 1 x)
    1
    (count (filter #(= 1 %) (map #(gcd x %) (range 1 x))))))
