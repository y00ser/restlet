(ns restlet.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [clojure.java.io]
             ))

(defroutes app-routes
  (compojure.route/files "/public")
  (GET "/" [] "worked")
  (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults))


