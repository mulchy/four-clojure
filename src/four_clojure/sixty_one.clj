(ns four-clojure.sixty-one)

(defn make-map [ks vs]
  (if (< (count ks) (count vs))
    (reduce (fn [acc val]
              (conj acc [val (nth vs (count acc))] ))
            {}
            ks)
    (reduce (fn [acc val]
              (conj acc [(nth ks (count acc)) val]))
            {}
            vs)))
