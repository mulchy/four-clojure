(ns four-clojure.sixty-nine)

(defn my-merge-with [f coll & maps]
  (let [new-map (apply conj {} maps)]
    (reduce
     (fn reducer [acc value]
       (let [curr-key (key value)
             curr-val (val value)]
         (if (contains? acc curr-key)
           (assoc acc
                  curr-key
                  (f (get acc curr-key) curr-val))
           (assoc acc
                  curr-key
                  curr-val))))
     coll
     new-map)))
