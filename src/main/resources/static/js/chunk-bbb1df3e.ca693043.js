(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-bbb1df3e"],{"0c33":function(t,e,a){},"4e82":function(t,e,a){"use strict";var s=a("23e7"),n=a("1c0b"),r=a("7b0b"),i=a("d039"),o=a("b301"),c=[].sort,l=[1,2,3],u=i((function(){l.sort(void 0)})),g=i((function(){l.sort(null)})),d=o("sort"),h=u||!g||d;s({target:"Array",proto:!0,forced:h},{sort:function(t){return void 0===t?c.call(r(this)):c.call(r(this),n(t))}})},"7b10":function(t,e,a){},"85d2":function(t,e,a){"use strict";var s=a("7b10"),n=a.n(s);n.a},ae2a:function(t,e,a){"use strict";var s=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("el-row",{staticClass:"row",attrs:{gutter:21}},[a("el-col",{attrs:{span:3}},[a("el-image",{staticStyle:{width:"100px",height:"50px","padding-top":"5px"},attrs:{src:t.url,fit:"contain"}})],1),a("el-col",{attrs:{span:6}},[a("el-menu",{attrs:{router:"","default-active":t.activeIndex,mode:"horizontal"},on:{select:t.handleSelect}},[a("el-menu-item",{attrs:{index:"/index"}},[t._v("首页")]),a("el-submenu",{attrs:{index:"2"}},[a("template",{slot:"title"},[t._v("游戏")]),t._l(t.sort,(function(e,s){return a("el-menu-item",{key:s,on:{click:function(e){return t.jump(s)}}},[t._v(t._s(e.sortName))])})),a("hr"),a("el-menu-item",{attrs:{index:"/allgame"}},[t._v("查看所有游戏")])],2),a("el-menu-item",{attrs:{index:"/community"}},[t._v("社区")])],1)],1),a("el-col",{attrs:{span:6}},[a("el-input",{staticClass:"sel",attrs:{placeholder:"请输入关键字"},nativeOn:{keyup:function(e){return!e.type.indexOf("key")&&t._k(e.keyCode,"enter",13,e.key,"Enter")?null:t.search()}},model:{value:t.sel,callback:function(e){t.sel=e},expression:"sel"}})],1),a("el-col",{attrs:{span:4}},[a("div",{staticClass:"selbtn"},[a("el-button",{attrs:{type:"primary",icon:"el-icon-search",plain:""},on:{click:function(e){return t.search()}}},[t._v("搜索")])],1)]),a("el-col",{attrs:{span:5}},[t.loginbol?t._e():a("div",{staticStyle:{"padding-top":"10px"}},[a("el-button",{attrs:{type:"text"},on:{click:function(e){return t.out()}}},[t._v("登陆注册")])],1),t.loginbol?a("div",{staticClass:"demo-type"},[a("el-popover",{staticClass:"popover",attrs:{placement:"top-start",trigger:"hover"}},[a("el-avatar",{attrs:{slot:"reference",size:"medium",plain:!0},on:{error:t.errorHandler},slot:"reference"},[t.loginbol?t._e():a("img",{attrs:{src:"https://cube.elemecdn.com/e/fd/0fc7d20532fdaf769a25683617711png.png"},on:{click:function(e){return t.skips()}}}),t.loginbol?a("img",{attrs:{src:t.userpic},on:{click:function(e){return t.skips()}}}):t._e()]),t.loginbol?a("el-button",{attrs:{type:"primary"},on:{click:function(e){return t.toMydata()}}},[t._v("个人中心")]):t._e(),a("el-button",{attrs:{type:"danger"},on:{click:function(e){return t.out()}}},[t.loginbol?a("span",[t._v("登出")]):t._e()])],1)],1):t._e()])],1)},n=[],r=(a("4e82"),a("b640")),i=a.n(r),o={data:function(){return{url:i.a,activeIndex:"/index",sel:"",userpic:"https://cube.elemecdn.com/e/fd/0fc7d20532fdaf769a25683617711png.png",userId:"",msgs:"",thisName:"",refash:!1,loginbol:!1,sort:[{sortName:""}]}},created:function(){this.userId=sessionStorage.getItem("userId"),this.loadSort(),this.loadAvatar(),this.loadMsgData()},mounted:function(){var t=this,e=setInterval((function(){t.loadMsgData2(),t.refash&&t.ShowMsg()}),3e3);this.$once("hook:beforeDestroy",(function(){clearInterval(e)}))},methods:{loadAvatar:function(){var t=this,e=JSON.stringify({userinfoId:this.userId});this.$axios.post("/user/showuser",e).then((function(e){e.data?(e.data.userinfoImg&&(t.userpic=e.data.userinfoImg),t.loginbol=!0):t.loginbol=!1})).catch((function(t){return console.log("err",t),t}))},loadSort:function(){var t=this;this.$axios.post("/sort/showsort").then((function(e){e&&(t.sort=e.data)})).catch((function(t){return console.log("err",t),t}))},loadMsgData:function(){var t=this,e=JSON.stringify({privatemsgAcceptid:this.userId});this.$axios.post("/msg/refreshmsg",e).then((function(e){e&&t.msgs!==e.data.privatemsgContent&&(t.msgs=e.data.privatemsgContent,t.thisName=e.data.privatemsgSendname)})).catch((function(t){return console.log("err",t),t}))},loadMsgData2:function(){var t=this,e=JSON.stringify({privatemsgAcceptid:this.userId});this.$axios.post("/msg/refreshmsg",e).then((function(e){e&&(t.msgs!==e.data.privatemsgContent?(t.msgs=e.data.privatemsgContent,t.thisName=e.data.privatemsgSendname,t.refash=!0):t.refash=!1)})).catch((function(t){return console.log("err",t),t}))},ShowMsg:function(){this.$notify({title:this.thisName,iconClass:"el-icon-chat-dot-round",message:this.msgs})},handleSelect:function(t,e){console.log(t,e)},out:function(){this.$router.push({path:"/us_login"}),sessionStorage.removeItem("userId")},search:function(){this.$router.push({path:"/selgame",query:{sel:this.sel}})},errorHandler:function(){return!0},jump:function(t){this.$router.push({path:"/allgame",query:{sortname:this.sort[t].sortName}})},skips:function(){this.loginbol?this.$router.push({path:"/othersdata",query:{thisId:this.userId}}):this.$message.error("请先登陆")},toMydata:function(){this.loginbol?this.$router.push({path:"/mydata"}):this.$message.error("请先登陆")}}},c=o,l=(a("c382"),a("2877")),u=Object(l["a"])(c,s,n,!1,null,null,null);e["a"]=u.exports},b301:function(t,e,a){"use strict";var s=a("d039");t.exports=function(t,e){var a=[][t];return!a||!s((function(){a.call(null,e||function(){throw 1},1)}))}},b640:function(t,e,a){t.exports=a.p+"img/logo.78c810f6.jpg"},c382:function(t,e,a){"use strict";var s=a("0c33"),n=a.n(s);n.a},d878:function(t,e,a){"use strict";a.r(e);var s=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",[a("el-container",[a("el-header",[a("indexheader")],1),a("el-container",[a("el-main",{staticClass:"main"},[a("hr",{staticClass:"line"}),a("div",[a("div",{staticClass:"list"},[a("el-tabs",{attrs:{type:"border-card"}},[a("div",{staticClass:"title"},[a("span",[t._v("搜索到的游戏")])]),a("el-table",{staticClass:"block",attrs:{data:t.gamelist.slice((t.currpage-1)*t.pagesize,t.currpage*t.pagesize)}},[a("el-table-column",{attrs:{width:"960px"},scopedSlots:t._u([{key:"default",fn:function(e){return[a("el-card",{attrs:{"body-style":{padding:"0px"}}},[a("img",{staticClass:"image",attrs:{src:e.row.gameImg}}),a("div",{staticClass:"box",staticStyle:{padding:"14px"}},[a("el-button",{staticClass:"gamename",attrs:{type:"text"},on:{click:function(a){return t.skip(e.$index,e.row)}}},[t._v(t._s(e.row.gameName))]),a("div",[a("el-tag",{staticClass:"tag"},[t._v(t._s(e.row.gameCharacter))])],1)],1),a("div",{staticClass:"gameprice"},[a("div",{staticClass:"pricetag"},[e.row.gamePromotion?a("el-tag",{attrs:{color:"Orange",effect:"dark",type:"warning"}},[t._v(t._s(100*e.row.gameDiscount)+"%")]):t._e()],1),e.row.gamePromotion?t._e():a("div",{staticClass:"nowprice2"},[t._v("¥ "+t._s(e.row.gamePrice))]),e.row.gamePromotion?a("div",{staticClass:"nowprice"},[t._v("¥ "+t._s(e.row.gamePrice*e.row.gameDiscount))]):t._e(),e.row.gamePromotion?a("div",{staticClass:"oldprice"},[t._v("¥ "+t._s(e.row.gamePrice))]):t._e()])])]}}])})],1),a("el-pagination",{staticStyle:{"padding-top":"20px",float:"right"},attrs:{background:"",layout:"total,sizes,prev, pager, next,jumper",total:t.gamelist.length,"page-sizes":[5,10,20],"page-size":t.pagesize,"current-page":t.currpage},on:{"size-change":t.handleSizeChange,"current-change":t.handleCurrentChange}})],1)],1)])])],1)],1)],1)},n=[],r=a("ae2a"),i={inject:["reload"],components:{indexheader:r["a"]},data:function(){return{Sel:"",pagesize:5,currpage:1,gamelist:[{gameId:"",gameImg:"",gameName:"",gameCharacter:"",gameDiscount:"",gamePrice:"",gamePromotion:""}]}},created:function(){this.getSortname(),this.loadSelgame()},beforeRouteUpdate:function(t,e,a){t.fullPath!==e.fullPath&&(this.reload(),a())},methods:{getSortname:function(){this.$route.query&&(this.Sel=this.$route.query.sel)},loadSelgame:function(){var t=this,e=JSON.stringify({gameName:this.Sel});this.$axios.post("/game/showlike",e).then((function(e){e&&200===e.status&&(t.gamelist=e.data)}))},handleSizeChange:function(t){this.pagesize=t},handleCurrentChange:function(t){this.currpage=t},skip:function(t,e){this.$router.push({path:"/detailedgame",query:{gameid:e.gameId}})}}},o=i,c=(a("85d2"),a("2877")),l=Object(c["a"])(o,s,n,!1,null,"3a338484",null);e["default"]=l.exports}}]);
//# sourceMappingURL=chunk-bbb1df3e.ca693043.js.map