(ns four-clojure.fifty-six-test
  (:require [expectations :refer [expect]]
            [four-clojure.fifty-six :refer :all]))

(expect
 [1 2 3 4]
 (my-distinct [1 2 1 3 1 2 4]))
(expect
 [:a :b :c]
 (my-distinct [:a :a :b :b :c :c]))
(expect
 '([2 4] [1 2] [1 3])
 (my-distinct '([2 4] [1 2] [1 3] [1 3])))
(expect
 (range 50)
 (my-distinct (range 50)))
