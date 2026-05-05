## 📌 프로젝트 개요

학원 환경(이중 NAT: 공유기 → VMware) 기반의 온프레미스 Kubernetes 클러스터가  
AWS Private VPC 내 리소스(RDS 등)에 접근할 수 있도록 구성한  
하이브리드 인프라 구축 프로젝트입니다.

외부에서 직접 접근이 어려운 네트워크 구조를 해결하기 위해  
Tailscale(WireGuard 기반 VPN)을 활용하여 온프레미스와 AWS 간  
사설 네트워크를 구성하였으며,

이를 기반으로 CI/CD(GitHub Actions), 컨테이너 레지스트리(ECR),  
GitOps(Argo CD)까지 연계하여 실제 운영 환경에 가까운  
배포 및 인프라 구조를 설계하고 구현하였습니다.
