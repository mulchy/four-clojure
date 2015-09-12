(ns four-clojure.fifty-five-test
  (:require [clojure.test :refer :all]
            [four-clojure.fifty-five :refer :all]))

(deftest test-count-occurances
  (testing "count-occuances"
    (is (= (count-occurances [1 1 2 3 2 1 1]) {1 4, 2 2, 3 1}))
    (is (= (count-occurances [:b :a :b :a :b]) {:a 2, :b 3}))
    (is (= (count-occurances '([1 2] [1 3] [1 3])) {[1 2] 1, [1 3] 2}))))
