(ns four-clojure.fifty-six)

(defn seq-contains? [coll target] (some #(= target %) coll))

(defn my-distinct
  [coll]
  (reduce
   (fn [acc val]
     (if (seq-contains? acc val)
       acc
       (conj acc val)))
   []
   coll))
