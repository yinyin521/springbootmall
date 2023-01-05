<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="include/header.jsp" %>
<head>
<meta charset="utf-8"/>
<meta name="renderer" content="webkit"/>
<meta http-equiv="X-UA-Compatible" content="IE=Edge"/>
    <script src="${pageContext.request.contextPath}/static/js/fore/fore_home.js"></script>
    <link href="${pageContext.request.contextPath}/static/css/fore/fore_home.css" rel="stylesheet"/>
    <title>网上书城 -- 电子商城</title>
</head>
<style>
.navSidebars{width:65px;position:fixed;right:10px;top:550px;background:#f8f6f6;z-index:99999}.navSidebars div{padding-top:10px;text-align:center;cursor:pointer;position:relative;height:42px}
.navSidebars .kf_chat .hover-content{display:none;height:160px;position:absolute;right:50px;top:-12px;z-index:10;width:350px;text-align:left;}.navSidebars .kf-tel .hover-content{display:none;height:160px;position:absolute;right:50px;top:0;z-index:10;width:350px;text-align:left;}
.navSidebars .add-chat .hover-content{display:none;height:160px;position:absolute;right:50px;top:-12px;z-index:10;width:350px;text-align:left;}.navSidebars .__wechat .hover-content{display:none;height:160px;position:absolute;right:75px;top:-12px;z-index:10;width:160px;text-align:left;}
.kf_chat,.kf-tel,.add-chat,.__wechat,.right_arrow{padding-top:10px;margin-bottom:10px;}.navSidebars div:hover .hover-content{display:block}.navSidebars span{color:#fff}.kf_chat .hover-content,.add-chat .hover-content,.kf .hover-content{padding-left:6px}
.navSidebars .kf-tel .hover-content .tiptel{display:block;height:28px;line-height:28px;font-size:15px}.kf-avatar{position:absolute !important;top:-81px;right:-18px}.navSidebars .hover-content span{vertical-align:middle;color:#FFF;font-size:16px;font-family:"Microsoft Yahei"}
.navSidebars .hover-content img{float:left;margin-left:10px;margin-top:2px;width:160px;height:160px}  .carousel-image{background-position:center;background-repeat:no-repeat;height:460px;cursor:pointer}
.carousel-control span {position: relative;top: 50%;right: 50%;}
</style>
<body>
<nav>
    <%@ include file="include/navigator.jsp" %>
<script>


    $(function () {
    	 /*  var barTop = $('.header').offset().top; */
         $(window).on('scroll',function () {
             var scrollTop = $(document).scrollTop();
             if (scrollTop >= 165) {
                //固定在上方
                 $('.header-wrap').css({position: 'fixed',top: 0});
                 // 显示替代的条
                 $('.header-wrap').css('display','block');
             } else {
                 $('.header-wrap').css('position','static');
                 $('.header-wrap').css('display','none'); 
             }
         });
 
    	
    });
</script>

    <div class="header">
        <div class="mallSearch">
            <form action="${pageContext.request.contextPath}/product" method="get">
                <div class="mallSearch-input">
                    <input class="header_search_input" type="text" name="product_name" placeholder="搜索 商品名称"
                           maxlength="50">
                    <input class="header_search_button" type="submit" value="搜索">
                </div>
            </form>

        </div>
    </div>
    <div class="header-wrap">
	    <div class="home_nav">
		   <a href="${pageContext.request.contextPath}"><img src="${pageContext.request.contextPath}/static/images/fore/WebsiteImage/logo1.png"></a>
		        <div class="mallSearch">
	            <form action="${pageContext.request.contextPath}/product" method="get">
	                <div class="mallSearch-input">
	                    <input class="header_search_input" type="text" name="product_name" placeholder="请输入商品名"
	                           maxlength="50">
	                    <input class="header_search_button" type="submit" value="搜索">
	                </div>
	            </form>
	        </div>
		</div> 
    </div>
</nav>
<script>
    $(function () {
        var $carousels = $('.carousel');
        var startX,endX;
        var offset = 50;
        $carousels.on('touchstart',function (e) {
            startX = e.originalEvent.touches[0].clientX;

        });
        $carousels.on('touchmove',function (e) {
            endX = e.originalEvent.touches[0].clientX;
        });
        $carousels.on('touchend',function (e) {
            var distance = Math.abs(startX - endX);
            if (distance > offset){
                $(this).carousel(startX >endX ? 'next':'prev');
            }
        })
    });
</script>
<div class="navSidebars">
    <div class="right_arrow">
        <img src="${pageContext.request.contextPath}/static/images/fore/WebsiteImage/shouye-zhiding.png"/>
        <br/>回到顶部</span>
        <div class="hover-content">
        </div>
    </div>
</div>
<script>
$(function(){
    $('.right_arrow').on('click', function (e) {
        $('html,body').animate({
            scrollTop: 0
        }, 700);
        return false;
    });    
});
</script>
<div class="banner_main">


<div class="banner_do">
    <div class="banner_goods">
        <c:forEach items="${requestScope.categoryList}" var="category">
            <c:if test="${fn:length(category.productList)>0}">
                <div class="banner_goods_type">
                    <div class="banner_goods_title">
                        <span></span>
                        <p>${category.category_name}</p>
                    </div>
                    <a href="${pageContext.request.contextPath}/product?category_id=${category.category_id}"><img
                            class="banner_goods_show"
                            src="${category.category_image_src}"></a>
                    <div class="banner_goods_items">
                        <c:forEach items="${category.productList}" var="product" varStatus="i">
                            <c:if test="${i.index<8}">
                                <div class="banner_goods_item">
                                    <a href="product/${product.product_id}" class="goods_link"></a>
                                    <img src="${product.singleProductImageList[0].productImage_src}">
                                    <a href="product/${product.product_id}"
                                       class="goods_name">${product.product_name}</a>
                                    <span class="goods_price">￥${product.product_sale_price}</span>
                                </div>
                            </c:if>
                        </c:forEach>
                    </div>
                </div>
            </c:if>
        </c:forEach>
    </div>
</div>
</body>