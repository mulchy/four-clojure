(ns four-clojure.sixty-five)

(defn black-box [coll]
  (cond
    (empty? coll)
    (black-box (conj coll [1 2]))

    (=
     (count coll)
     (count (into coll coll)))
    (if (= (set coll) coll)
      :set
      :map)

    (= :test (first (conj coll :test)))
    :list

    (= :test (last (conj coll :test)))
    :vector

    :else
    :wtf))
