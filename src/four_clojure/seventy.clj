(ns four-clojure.seventy)

(def punct
  (->> ".,!?"
       (map char)
       (into #{})))

(defn remove-punct [string]
  (->> string
       (filter #(not (contains? punct %)))
       (apply str)))

(defn split [string]
  (->> string
       (partition-by #(= \space %))
       (map #(apply str %))
       (filter #(not= " " %))))

(defn compare-strings-ignore-case [x y]
  (.compareToIgnoreCase x y))

(defn split-and-sort [string]
  (->> string
       (remove-punct)
       (split)
       (sort compare-strings-ignore-case)))



((fn split-and-sort [string]
    (let [remove-punct (fn [string]
                         (let [punct (->> ".,!?"
                                          (map char)
                                          (into #{}))]
                           (->> string
                                (filter #(not (contains? punct %)))
                                (apply str))))

          split (fn  [string]
                    (->> string
                         (partition-by #(= \space %))
                         (map #(apply str %))
                         (filter #(not= " " %))))

          compare-strings-ignore-case (fn [x y]
                                        (.compareToIgnoreCase x y))]

      (->> string
           (remove-punct)
           (split)
           (sort compare-strings-ignore-case))))
 "Have a nice day.")
