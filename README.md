# springboot_api_encryption

描述 ：Spring Boot接口加密，可以对返回值、参数值通过注解的方式自动加解密 。

说明：为防止私钥泄漏，由服务端生成两对密钥，分别是（前端公钥+私钥，后端公钥加私钥），
>采用加解密模式为：前端使用后台公钥加密，使用前端私钥解密；后端使用前端公钥加密，使用后端私钥解密。前后端统一使用公钥加密，私钥解密。

附上：

      VUE内使用RSA加解密：[VUE内使用RSA加解密](https://www.cnblogs.com/JQstronger/p/rsa_vue.html)
      
