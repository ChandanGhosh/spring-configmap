# spring-configmap
Exploring how to detect kubernetes ConfigMap changes automatically in a spring-boot project using spring cloud kubernetes api and reoad in the project while it is running in pod.

## Steps

* Create jar file

```

gradle clean build bootjar

```

* Create Docker image

```
docker build --force-rm -t spring-configmap

```

* Load in your cluster. I have used Kind for this demo. So to load in Kind, you can:

```

kind load docker-image spring-configmap

```

* Deploy everything in K8s cluster

```

kubectl apply -f k8s

```

* Now stream logs from the pod

```

kubectl logs -f <pod-name>

```

* While the logs are streaming you should see "Welcome from K8S!" from console.

* Then modify the welcome.message value in in application.properties in k8s/config.yaml file

* Apply the changes again in a new terminal

```
kubectl apply -f k8s

```
* On the other terminal where you were streaming the logs, you should now able to see the changes! :)


