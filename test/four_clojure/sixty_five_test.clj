(ns four-clojure.sixty-five-test
  (:require [four-clojure.sixty-five :refer :all]
            [expectations :refer :all]))

(expect :map (black-box {:a 1, :b 2}))
(expect :list (black-box (range (rand-int 20))))
(expect :vector (black-box [1 2 3 4 5 6]))
(expect :set (black-box #{10 (rand-int 5)}))
(expect [:map :set :vector :list] (map black-box [{} #{} [] ()]))
