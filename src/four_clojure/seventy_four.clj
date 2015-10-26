(ns four-clojure.seventy-four)

(defn filter-squares [x]
  (let [square (fn [y] (* y y))
        square? (fn [z] (= z (square (Math/round (Math/sqrt z)))))]
  (->> x
       (#(clojure.string/split % #","))
       (map read-string)
       (filter square?)
       (clojure.string/join ","))))
