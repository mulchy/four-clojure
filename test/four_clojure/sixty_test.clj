(ns four-clojure.sixty-test
  (:require [expectations :refer [expect]]
            [four-clojure.sixty :refer :all]))


(expect
 [0 1 3 6 10]
 (take 5 (my-reductions + (range))))

(expect
 [[1] [1 2] [1 2 3] [1 2 3 4]]
 (my-reductions conj [1] [2 3 4]))
(expect
 (reduce * 2 [3 4 5])
 (last (my-reductions * 2 [3 4 5])))
