(ns four-clojure.seventy-three)

(defn third [x] (nth x 2))

(defn is-a-winner? [[row1 row2 row3 :as board] player]
  (not (empty? (filter identity (map (fn [x] (every? #(= player %) x))
                                      (conj
                                       ;; rows
                                       board

                                       ;; columns
                                       (map first board)
                                       (map second board)
                                       (map third board)

                                       ;; diagonals
                                       [(first row1)
                                        (second row2)
                                        (third row3)]
                                       [(third row1)
                                        (second row2)
                                        (first row3)]
                                       )
                                      )))))

(defn tic-tac-toe [board]
  (cond
    (is-a-winner? board :x) :x
    (is-a-winner? board :o) :o
    :else nil))
