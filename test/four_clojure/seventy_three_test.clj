(ns four-clojure.seventy-three-test
  (:require [expectations :refer [expect]]
            [four-clojure.seventy-three :refer [tic-tac-toe]]))

(expect nil (tic-tac-toe [[:e :e :e]
                          [:e :e :e]
                          [:e :e :e]]))

(expect :x (tic-tac-toe [[:x :e :o]
                         [:x :e :e]
                         [:x :e :o]]))

(expect :o (tic-tac-toe [[:e :x :e]
                         [:o :o :o]
                         [:x :e :x]]))

(expect nil (tic-tac-toe [[:x :e :o]
                          [:x :x :e]
                          [:o :x :o]]))

(expect :x (tic-tac-toe [[:x :e :e]
                         [:o :x :e]
                         [:o :e :x]]))

(expect :o (tic-tac-toe [[:x :e :o]
                         [:x :o :e]
                         [:o :e :x]]))

(expect nil (tic-tac-toe [[:x :o :x]
                          [:x :o :x]
                          [:o :x :o]]))
