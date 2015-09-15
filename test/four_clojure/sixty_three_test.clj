(ns four-clojure.sixty-three-test
  (:require [expectations :refer [expect]]
            [four-clojure.sixty-three :refer :all]))

(expect
 {false [1 3], true [6 8]}
 (my-group-by #(> % 5) [1 3 6 8]))

(expect {1/2 [[1 2] [2 4] [3 6]], 2/3 [[4 6]]}
   (my-group-by #(apply / %) [[1 2] [2 4] [4 6] [3 6]]))

(expect {1 [[1] [3]], 2 [[1 2] [2 3]], 3 [[1 2 3]]}
   (my-group-by count [[1] [1 2] [3] [1 2 3] [2 3]]))
