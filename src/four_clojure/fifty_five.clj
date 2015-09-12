(ns four-clojure.fifty-five)

(defn reducer
  [acc val]
  (assoc acc val (inc (get acc val 0))))

(def init-val {})

(defn count-occurances
  "takes a seq and returns a map of elements to frequencies"
  [coll]
  (reduce reducer init-val coll))

