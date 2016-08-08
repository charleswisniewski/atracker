(ns user
  (:require [mount.core :as mount]
            atracker.core))

(defn start []
  (mount/start-without #'atracker.core/repl-server))

(defn stop []
  (mount/stop-except #'atracker.core/repl-server))

(defn restart []
  (stop)
  (start))


