#!/bin/bash

set -e

cp ../../target/hello-service-1.0-SNAPSHOT.jar ./

docker build -t ic0deu/hello-service:b0 -t ic0deu/hello-service:latest .