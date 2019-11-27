<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <link href="https://cdnjs.cloudflare.com/ajax/libs/video.js/7.3.0/video-js.min.css" rel="stylesheet">
<script src="https://cdnjs.cloudflare.com/ajax/libs/video.js/7.3.0/video.min.js"></script>
 <script src="http://vjs.zencdn.net/5.5.3/video.js"></script>

</head>
<body>
 <h1>郭某的直播间</h1>
        <video 
            id="my-video" 
            class="video-js" 
            controls 
            preload="auto"
            width="740px" 
            height="500px"
            poster="http://ppt.downhot.com/d/file/p/2014/08/12/9d92575b4962a981bd9af247ef142449.jpg"
            data-setup="{}">

            <!-- 直播地址 -->
            <source src="rtmp://192.168.33.53/live/tiger" type="rtmp/flv">

        </video>

        <!-- 引入video.js -->
       

        
       

</body>
<!-- 自动播放 -->
 <script type="text/javascript">
            var myPlayer = videojs('my-video');
            videojs("my-video").ready(function(){
                var myPlayer = this;
                myPlayer.play();
            });
        </script> 
</html>