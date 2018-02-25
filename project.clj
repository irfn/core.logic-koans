(defproject core.logic-koans "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [koan-engine "0.2.4"]
                 [org.clojure/core.logic "0.8.11"]]
  :dev-dependencies [[lein-koan "0.1.4"]]
  :profiles {
             :dev {:dependencies [[lein-koan "0.1.4"]]}
             :user {:plugins [[cider/cider-nrepl "0.16.0"]]}
             }
  :repl-options {:init-ns koan-engine.runner
                 :init ^:displace (do (use '[koan-engine.core]))}
  :plugins [[lein-koan "0.1.4"]
            [cider/cider-nrepl "0.16.0"]]
  :main koan-engine.runner/exec
  )
