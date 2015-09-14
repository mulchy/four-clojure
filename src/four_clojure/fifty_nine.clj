(ns four-clojure.fifty-nine)

(defn my-juxt [& fns]
  (let [fns (distinct fns)]
       (fn [& args]
         (reduce (fn [acc f]
                   (conj acc (apply f args)))
                 []
                 fns))))
