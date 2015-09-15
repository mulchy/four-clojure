(ns four-clojure.sixty-two-test
  (:require [expectations :refer [expect]]
            [four-clojure.sixty-two :refer :all]))

(expect
 [1 2 4 8 16]
 (take 5 (my-iterate #(* 2 %) 1)))
(expect
 (take 100 (range))
 (take 100 (my-iterate inc 0)))
(expect
 (take 9 (cycle [1 2 3]))
 (take 9 (my-iterate #(inc (mod % 3)) 1)))
