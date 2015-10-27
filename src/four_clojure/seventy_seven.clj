(ns four-clojure.seventy-seven)

(defn anagram? [x y]
  (= (frequencies x) (frequencies y)))

(defn impl [coll acc]
  (if (empty? coll)
    acc
    (let [current (first coll)
          anagram-map (group-by #(anagram? current %) (rest coll))]
      (recur (get anagram-map false) (conj acc (into #{current} (get anagram-map true))))
    )))

(defn collect-anagrams [coll]
  (set (filter #(>= (count %) 2) (impl coll []))))

;; bmaddy's gorgeous solution
(fn [coll]
  (->> coll
       (group-by frequencies)
       vals
       (filter #(< 1 (count %)))
       (map set)
       set))
