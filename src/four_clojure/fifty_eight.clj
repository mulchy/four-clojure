(ns four-clojure.fifty-eight)

(defn my-juxt [& fns]
  (let [fns (distinct fns)]
       (fn [& args]
         (reduce (fn [acc f]
                   (conj acc (apply f args)))
                 []
                 fns))))
