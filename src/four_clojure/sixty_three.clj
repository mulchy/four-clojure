(ns four-clojure.sixty-three)

(defn my-group-by [f seq]
  (reduce
   (fn [acc val]
     (let [x (f val)]
       (assoc acc x (conj (get acc x []) val))))
   {}
   seq))
