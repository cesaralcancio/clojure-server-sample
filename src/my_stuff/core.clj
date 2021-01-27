(ns my-stuff.core
  (:use [ring.adapter.jetty])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "{\"hello-world\": \"Hello World Clojure first Web App!\"}"})

(run-jetty handler {:port  3000
                    :join? false})
