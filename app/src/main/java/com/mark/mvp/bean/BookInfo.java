package com.mark.mvp.bean;

import java.util.List;

/**
 * Created by chenzhen on 2018/6/29.
 */

public class BookInfo {


    /**
     * count : 1
     * start : 0
     * total : 200
     * books : [{"rating":{"max":10,"numRaters":132394,"average":"9.6","min":0},"subtitle":"","author":["[清] 曹雪芹 著","高鹗 续"],"pubdate":"1996-12","tags":[{"count":29157,"name":"红楼梦","title":"红楼梦"},{"count":24783,"name":"古典文学","title":"古典文学"},{"count":18518,"name":"曹雪芹","title":"曹雪芹"},{"count":14997,"name":"经典","title":"经典"},{"count":12730,"name":"古典名著","title":"古典名著"},{"count":11476,"name":"小说","title":"小说"},{"count":9097,"name":"中国","title":"中国"},{"count":8685,"name":"名著","title":"名著"}],"origin_title":"","image":"https://img1.doubanio.com/view/subject/m/public/s1070959.jpg","binding":"平装","translator":[],"catalog":"第一回 甄士隐梦幻识通灵 贾雨村风尘怀闺秀\n第二回 贾夫人仙逝扬州城 冷子兴演说荣国府\n第三回 托内兄如海酬训教 接外孙贾母惜孤女\n第四回 薄命女偏逢薄命郎 葫芦僧乱判葫芦案\n第五回 游幻境指迷十二钗 饮仙醪曲演红楼梦\n第六回 贾宝玉初试云雨情 刘姥姥一进荣国府\n第七回 送宫花贾琏戏熙凤 宴宁府宝玉会秦钟\n第八回 比通灵金莺微露意 探宝钗黛玉半含酸\n第九回 恋风流情友入家塾 起嫌疑顽童闹学堂\n第十回 金寡妇贪利权受辱 张太医论病细穷源\n第十一回 庆寿辰宁府排家宴 见熙凤贾瑞起淫心\n第十二回 王熙凤毒设相思局 贾天祥正照风月鉴\n第十三回 秦可卿死封龙禁尉 王熙凤协理宁国府\n第十四回 林如海捐馆扬州城 贾宝玉路谒北静王\n第十五回 王凤姐弄权铁槛寺 秦鲸卿得趣馒头庵\n第十六回 贾元春才选凤藻宫 秦鲸卿夭逝黄泉路\n第十七回 大观园试才题封额 荣国府归省庆元宵\n第十八回 皇恩重元妃省父母 天伦乐宝玉呈才藻\n第十九回 情切切良宵花解语 意绵绵静日玉生香\n第二十回 王熙凤正言弹妒意 林黛玉俏语谑娇音\n第二十一回 贤袭人娇嗔箴宝玉 俏平儿软语救贾琏\n第二十二回 听曲文宝玉悟禅机 制灯谜贾政悲谶语\n第二十三回 西厢记妙词通戏语 牡丹亭艳曲警芳心\n第二十四回 醉金刚轻财尚义侠 痴女儿遗帕惹相思\n第二十五回 魇魔法叔嫂逢五鬼 红楼梦通灵遇双真\n第二十六回 蜂腰桥设言传密意 潇湘馆春困发幽情\n第二十七回 滴翠亭杨妃戏彩蝶 埋香冢飞燕泣残红\n第二十八回 蒋玉菡情赠茜香罗 薛宝钗羞笼红麝串\n第二十九回 享福人福深还祷福 痴情女情重愈斟情\n第三十回 宝钗借扇机带双敲 龄官划蔷痴及局外\n第三十一回 撕扇子作千金一笑 因麒麟伏白首双星\n第三十二回 诉肺腑心迷活宝玉 含耻辱情烈死金钏\n第三十三回 手足耽耽小动唇舌 不肖种种大承笞挞\n第三十四回 情中情因情感妹妹 错里错以错劝哥哥\n第三十五回 白玉钏亲尝莲叶羹 黄金莺巧结梅花络\n第三十六回 绣鸳鸯梦兆绛芸轩 识分定情悟梨香院\n第三十七回 秋爽斋偶结海棠社 蘅芜苑夜拟菊花题\n第三十八回 林潇湘魁夺菊花诗 薛蘅芜讽和螃蟹咏\n第三十九回 村姥姥是信口开河 情哥哥偏寻根究底\n第四十回 史太君两宴大观园 金鸳鸯三宣牙牌令\n第四十一回 贾宝玉品茶栊翠庵 刘姥姥醉卧怡红院\n第四十二回 蘅芜君兰言解疑癖 潇湘子雅谑补馀香\n第四十三回 闲取乐偶攒金庆寿 不了情暂撮土为香\n第四十四回 变生不测凤姐泼醋 喜出望外平儿理妆\n第四十五回 金兰契互剖金兰语 风雨夕闷制风雨词\n第四十六回 尴尬人难免尴尬事 鸳鸯女誓绝鸳鸯偶\n第四十七回 呆霸王调情遭苦打 冷郎君惧祸走他乡\n第四十八回 滥情人情误思游艺 慕雅女雅集苦吟诗\n第四十九回 琉璃世界白雪红梅 脂粉香娃割腥啖膻\n第五十回 芦雪庵争联即景诗 暖香坞雅制春灯谜\n第五十一回 薛小妹新编怀古诗 胡庸医乱用虎狼药\n第五十二回 俏平儿情掩虾须镯 勇晴雯病补雀金裘\n第五十三回 宁国府除夕祭宗祠 荣国府元宵开夜宴\n第五十四回 史太君破陈腐旧套 王熙凤效戏彩班衣\n第五十五回 辱亲女愚妾争闲气 欺幼主刁奴蓄险心\n第五十六回 敏探春兴利除宿弊 识宝钗小惠全大体\n第五十七回 慧紫鹃情辞试忙玉 慈姨妈爱语慰痴颦\n第五十八回 杏子阴假凤泣虚凰 茜纱窗真情揆痴理\n第五十九回 柳叶渚边嗔莺咤燕 绛芸轩里召将飞符\n第六十回 茉莉粉替去蔷薇硝 玫瑰露引来茯苓霜\n第六十一回 投鼠忌器宝玉瞒赃 判冤决狱平儿行权\n第六十二回 憨湘云醉眠芍药茵 呆香菱情解石榴裙\n第六十三回 寿怡红群芳开夜宴 死金丹独艳理亲丧\n第六十四回 幽淑女悲题五美吟 浪荡子情遗九龙佩\n第六十五回 贾二舍偷娶尤二姨 尤三姐思嫁柳二郎\n第六十六回 情小妹耻情归地府 冷二郎一冷入空门\n第六十七回 见土仪颦卿思故里 闻秘事凤姐讯家童\n第六十八回 苦尤娘赚入大观园 酸凤姐大闹宁国府\n第六十九回 弄小巧用借剑杀人 觉大限吞生金自逝\n第七十回 林黛玉重建桃花社 史湘云偶填柳絮词\n第七十一回 嫌隙人有心生嫌隙 鸳鸯女无意遇鸳鸯\n第七十二回 王熙凤恃强羞说病 来旺妇倚势霸成亲\n第七十三回 痴丫头误拾绣春囊 懦小姐不问累金凤\n第七十四回 惑奸谗抄检大观园 矢孤介社绝宁国府\n第七十五回 开夜宴异兆发悲音 赏中秋新词得佳谶\n第七十六回 凸碧堂品笛感凄清 凹晶馆联诗悲寂寞\n第七十七回 俏丫鬟抱屈夭风流 美优伶斩情归水月\n第七十八回 老学士闲征危画词 痴公子杜撰芙蓉诔\n第七十九回 薛文龙悔娶河东狮 贾迎春误嫁中山狼\n第八十回 美香菱屈受贪夫棒 王道士胡诌妒妇方\n第八十一回 占旺相四美钓游鱼 奉严词两番入家塾\n第八十二回 老学究讲义警顽心 病潇湘痴魂惊恶梦\n第八十三回 省宫闱贾元妃染恙 闹闺阃薛宝钗吞声\n第八十四回 试文字宝玉始提亲 探惊风贾环重结怨\n第八十五回 贾存周报升郎中任 薛文起复惹放流刑\n第八十六回 受私贿老官翻案牍 寄闲情淑女解琴书\n第八十七回 感秋声抚琴悲往事 坐禅寂走火入邪魔\n第八十八回 博庭欢宝玉赞孤儿 正家法贾珍鞭悍仆\n第八十九回 人亡物在公子填词 蛇影杯弓颦卿绝粒\n第九十回 失绵衣贫女耐嗷嘈 送果品小朗惊叵测\n第九十一回 纵淫心宝蟾工设计 布疑阵宝玉妄谈禅\n第九十二回 评女传巧姐慕贤良 玩母珠贾政参聚散\n第九十三回 甄家仆投靠贾家门 水月庵掀翻风月案\n第九十四回 宴海棠贾母赏花妖 失宝玉通灵知奇祸\n第九十五回 因讹成实元妃薨逝 以假混真宝玉疯颠\n第九十六回 瞒消息凤姐设奇谋 泄机关颦儿迷本性\n第九十七回 林黛玉焚稿断痴情 薛宝钗出闺成大礼\n第九十八回 苦绛珠魂归离恨天 病神瑛泪洒相思地\n第九十九回 守官箴恶奴同破例 阅邸报老舅自担惊\n第一百回 破好事香菱结深恨 悲远嫁宝玉感离情\n第一百一回 大观园月夜警幽魂 散花寺神签占异兆\n第一百二回 宁国府骨肉病灾浸 大观园符水驱妖孽\n第一百三回 施毒计金桂自焚身 昧真禅雨村空遇旧\n第一百四回 醉金刚小鳅生大浪 痴公子馀痛触前情\n第一百五回 锦衣军查抄宁国府 骢马使弹劾平安州\n第一百六回 王熙凤致祸抱羞惭 贾太君祷天消灾患\n第一百七回 散馀资贾母明大义 复世职政老沐天恩\n第一百八回 强欢笑蘅芜庆生辰 死缠绵潇湘闻鬼哭\n第一百九回 候芳魂五儿承错爱 还孽债迎女返真元\n第一百十回 史太君寿终归地府 王凤姐力诎失人心\n第百十一回 鸳鸯女殉主登太虚 狗彘奴欺天招伙盗\n第百十二回 活冤孽妙姑遭大劫 死雠仇赵妾赴冥曹\n第百十三回 忏宿冤凤姐托村妪 释旧憾情婢感痴郎\n第百十四回 王熙凤历幻返金陵 甄应嘉蒙恩还玉阙\n第百十五回 惑偏私惜春矢素志 证同类宝玉失相知\n第百十六回 得通灵幻镜悟仙缘 送慈柩故乡全孝道\n第百十七回 阻超凡佳人双护玉 欢聚党恶子独承家\n第百十八回 记微嫌舅兄欺弱女 警谜语妻妾谏痴人\n第百十九回 中乡魁宝玉却尘缘 沐皇恩贾家延世泽\n第百二十回 甄士隐详说太虚情 贾雨村归结红楼梦","pages":"1606","images":{"small":"https://img1.doubanio.com/view/subject/s/public/s1070959.jpg","large":"https://img1.doubanio.com/view/subject/l/public/s1070959.jpg","medium":"https://img1.doubanio.com/view/subject/m/public/s1070959.jpg"},"alt":"https://book.douban.com/subject/1007305/","id":"1007305","publisher":"人民文学出版社","isbn10":"702000220X","isbn13":"9787020002207","title":"红楼梦","url":"https://api.douban.com/v2/book/1007305","alt_title":"","author_intro":"曹雪芹,（？-1763，一作1764）清小说家。名霑，字梦阮，号雪芹、芹圃、芹溪。为满洲正白旗\u201c包衣\u201d人。自曾祖起，三代任江宁织造，其祖曹寅尤为康熙帝所信用。雍正初年，在统计阶级内部政治斗争牵连下，雪芹家受到重大打击，其父免职，产业被抄，遂随家迁居北京。他早年经历了一段封建大官僚地主家庭的繁华生活，后因家道衰落，趋于艰困。晚期居北京西郊，贫病而卒，年未及五十。性情高傲，嗜酒健谈。具有深厚的文化修养和卓越的艺术才能。他生活在我国已有资本主义生产萌芽的封建末世，在其后期又有机会接触到下层人民，因而对当时社会阶级斗争和思想斗争有较具体的感受，看到了统治阶级的腐朽凶残和内部的分崩离析。曾以十年时间，从事《石头记》（即《红楼梦》）的创作。书中通过一个贵族官僚大家庭的盛衰历史的描写，塑造了许多典型人物形象，对当时社会的黑暗腐败，进行了深刻的解剖和批判，并热情地歌颂了具有异端思想的男女青年，成为我国古典小说中伟大的现实主义作品。但其中也反映了作者为封建制度\u201c补天\u201d的幻想和找不到出路的悲观情绪。据称先后曾增删五次，但未成全书而卒；今流行本一百二十回，后四十回一般认为是高鹗所续。也能诗，又善画石，但作品流传绝少。","summary":"《红楼梦》是一部百科全书式的长篇小说。以宝黛爱情悲剧为主线，以四大家族的荣辱兴衰为背景，描绘出18世纪中国封建社会的方方面面，以及封建专制下新兴资本主义民主思想的萌动。结构宏大、情节委婉、细节精致，人物形象栩栩如生，声口毕现，堪称中国古代小说中的经 典。\n由红楼梦研究所校注、人民文学出版社出版的《红楼梦》以庚辰（1760）本《脂砚斋重评石头记》为底本，以甲戌（1754）本、已卯（1759）本、蒙古王府本、戚蓼生序本、舒元炜序本、郑振铎藏本、红楼梦稿本、列宁格勒藏本（俄藏本）、程甲本、程乙本等众多版本为参校本，是一个博采众长、非常适合大众阅读的本子；同时，对底本的重要修改，皆出校记，读者可因以了解《红楼梦》的不同版本状况。\n红学所的校注本已印行二十五年，其间1994年曾做过一次修订，又十几年过去，2008年推出修订第三版，体现了新的校注成果和科研成果。\n关于《红楼梦》的作者，原本就有多种说法及推想，\u201c前八十回曹雪芹著、后四十回高鹗续\u201d的说法只是其中之一，这次修订中校注者改为\u201c前八十回曹雪芹著；后四十回无名氏续，程伟元、高鹗整理\u201d，应当是一种更科学的表述，体现了校注者对这一问题的新的认识。\n现在这个修订后的《红楼梦》是更加完善。","series":{"id":"106","title":"中国古典文学读本丛书"},"price":"59.70元"}]
     */

    private int count;
    private int start;
    private int total;
    private List<BooksBean> books;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<BooksBean> getBooks() {
        return books;
    }

    public void setBooks(List<BooksBean> books) {
        this.books = books;
    }

    public static class BooksBean {
        /**
         * rating : {"max":10,"numRaters":132394,"average":"9.6","min":0}
         * subtitle :
         * author : ["[清] 曹雪芹 著","高鹗 续"]
         * pubdate : 1996-12
         * tags : [{"count":29157,"name":"红楼梦","title":"红楼梦"},{"count":24783,"name":"古典文学","title":"古典文学"},{"count":18518,"name":"曹雪芹","title":"曹雪芹"},{"count":14997,"name":"经典","title":"经典"},{"count":12730,"name":"古典名著","title":"古典名著"},{"count":11476,"name":"小说","title":"小说"},{"count":9097,"name":"中国","title":"中国"},{"count":8685,"name":"名著","title":"名著"}]
         * origin_title :
         * image : https://img1.doubanio.com/view/subject/m/public/s1070959.jpg
         * binding : 平装
         * translator : []
         * catalog : 第一回 甄士隐梦幻识通灵 贾雨村风尘怀闺秀
         第二回 贾夫人仙逝扬州城 冷子兴演说荣国府
         第三回 托内兄如海酬训教 接外孙贾母惜孤女
         第四回 薄命女偏逢薄命郎 葫芦僧乱判葫芦案
         第五回 游幻境指迷十二钗 饮仙醪曲演红楼梦
         第六回 贾宝玉初试云雨情 刘姥姥一进荣国府
         第七回 送宫花贾琏戏熙凤 宴宁府宝玉会秦钟
         第八回 比通灵金莺微露意 探宝钗黛玉半含酸
         第九回 恋风流情友入家塾 起嫌疑顽童闹学堂
         第十回 金寡妇贪利权受辱 张太医论病细穷源
         第十一回 庆寿辰宁府排家宴 见熙凤贾瑞起淫心
         第十二回 王熙凤毒设相思局 贾天祥正照风月鉴
         第十三回 秦可卿死封龙禁尉 王熙凤协理宁国府
         第十四回 林如海捐馆扬州城 贾宝玉路谒北静王
         第十五回 王凤姐弄权铁槛寺 秦鲸卿得趣馒头庵
         第十六回 贾元春才选凤藻宫 秦鲸卿夭逝黄泉路
         第十七回 大观园试才题封额 荣国府归省庆元宵
         第十八回 皇恩重元妃省父母 天伦乐宝玉呈才藻
         第十九回 情切切良宵花解语 意绵绵静日玉生香
         第二十回 王熙凤正言弹妒意 林黛玉俏语谑娇音
         第二十一回 贤袭人娇嗔箴宝玉 俏平儿软语救贾琏
         第二十二回 听曲文宝玉悟禅机 制灯谜贾政悲谶语
         第二十三回 西厢记妙词通戏语 牡丹亭艳曲警芳心
         第二十四回 醉金刚轻财尚义侠 痴女儿遗帕惹相思
         第二十五回 魇魔法叔嫂逢五鬼 红楼梦通灵遇双真
         第二十六回 蜂腰桥设言传密意 潇湘馆春困发幽情
         第二十七回 滴翠亭杨妃戏彩蝶 埋香冢飞燕泣残红
         第二十八回 蒋玉菡情赠茜香罗 薛宝钗羞笼红麝串
         第二十九回 享福人福深还祷福 痴情女情重愈斟情
         第三十回 宝钗借扇机带双敲 龄官划蔷痴及局外
         第三十一回 撕扇子作千金一笑 因麒麟伏白首双星
         第三十二回 诉肺腑心迷活宝玉 含耻辱情烈死金钏
         第三十三回 手足耽耽小动唇舌 不肖种种大承笞挞
         第三十四回 情中情因情感妹妹 错里错以错劝哥哥
         第三十五回 白玉钏亲尝莲叶羹 黄金莺巧结梅花络
         第三十六回 绣鸳鸯梦兆绛芸轩 识分定情悟梨香院
         第三十七回 秋爽斋偶结海棠社 蘅芜苑夜拟菊花题
         第三十八回 林潇湘魁夺菊花诗 薛蘅芜讽和螃蟹咏
         第三十九回 村姥姥是信口开河 情哥哥偏寻根究底
         第四十回 史太君两宴大观园 金鸳鸯三宣牙牌令
         第四十一回 贾宝玉品茶栊翠庵 刘姥姥醉卧怡红院
         第四十二回 蘅芜君兰言解疑癖 潇湘子雅谑补馀香
         第四十三回 闲取乐偶攒金庆寿 不了情暂撮土为香
         第四十四回 变生不测凤姐泼醋 喜出望外平儿理妆
         第四十五回 金兰契互剖金兰语 风雨夕闷制风雨词
         第四十六回 尴尬人难免尴尬事 鸳鸯女誓绝鸳鸯偶
         第四十七回 呆霸王调情遭苦打 冷郎君惧祸走他乡
         第四十八回 滥情人情误思游艺 慕雅女雅集苦吟诗
         第四十九回 琉璃世界白雪红梅 脂粉香娃割腥啖膻
         第五十回 芦雪庵争联即景诗 暖香坞雅制春灯谜
         第五十一回 薛小妹新编怀古诗 胡庸医乱用虎狼药
         第五十二回 俏平儿情掩虾须镯 勇晴雯病补雀金裘
         第五十三回 宁国府除夕祭宗祠 荣国府元宵开夜宴
         第五十四回 史太君破陈腐旧套 王熙凤效戏彩班衣
         第五十五回 辱亲女愚妾争闲气 欺幼主刁奴蓄险心
         第五十六回 敏探春兴利除宿弊 识宝钗小惠全大体
         第五十七回 慧紫鹃情辞试忙玉 慈姨妈爱语慰痴颦
         第五十八回 杏子阴假凤泣虚凰 茜纱窗真情揆痴理
         第五十九回 柳叶渚边嗔莺咤燕 绛芸轩里召将飞符
         第六十回 茉莉粉替去蔷薇硝 玫瑰露引来茯苓霜
         第六十一回 投鼠忌器宝玉瞒赃 判冤决狱平儿行权
         第六十二回 憨湘云醉眠芍药茵 呆香菱情解石榴裙
         第六十三回 寿怡红群芳开夜宴 死金丹独艳理亲丧
         第六十四回 幽淑女悲题五美吟 浪荡子情遗九龙佩
         第六十五回 贾二舍偷娶尤二姨 尤三姐思嫁柳二郎
         第六十六回 情小妹耻情归地府 冷二郎一冷入空门
         第六十七回 见土仪颦卿思故里 闻秘事凤姐讯家童
         第六十八回 苦尤娘赚入大观园 酸凤姐大闹宁国府
         第六十九回 弄小巧用借剑杀人 觉大限吞生金自逝
         第七十回 林黛玉重建桃花社 史湘云偶填柳絮词
         第七十一回 嫌隙人有心生嫌隙 鸳鸯女无意遇鸳鸯
         第七十二回 王熙凤恃强羞说病 来旺妇倚势霸成亲
         第七十三回 痴丫头误拾绣春囊 懦小姐不问累金凤
         第七十四回 惑奸谗抄检大观园 矢孤介社绝宁国府
         第七十五回 开夜宴异兆发悲音 赏中秋新词得佳谶
         第七十六回 凸碧堂品笛感凄清 凹晶馆联诗悲寂寞
         第七十七回 俏丫鬟抱屈夭风流 美优伶斩情归水月
         第七十八回 老学士闲征危画词 痴公子杜撰芙蓉诔
         第七十九回 薛文龙悔娶河东狮 贾迎春误嫁中山狼
         第八十回 美香菱屈受贪夫棒 王道士胡诌妒妇方
         第八十一回 占旺相四美钓游鱼 奉严词两番入家塾
         第八十二回 老学究讲义警顽心 病潇湘痴魂惊恶梦
         第八十三回 省宫闱贾元妃染恙 闹闺阃薛宝钗吞声
         第八十四回 试文字宝玉始提亲 探惊风贾环重结怨
         第八十五回 贾存周报升郎中任 薛文起复惹放流刑
         第八十六回 受私贿老官翻案牍 寄闲情淑女解琴书
         第八十七回 感秋声抚琴悲往事 坐禅寂走火入邪魔
         第八十八回 博庭欢宝玉赞孤儿 正家法贾珍鞭悍仆
         第八十九回 人亡物在公子填词 蛇影杯弓颦卿绝粒
         第九十回 失绵衣贫女耐嗷嘈 送果品小朗惊叵测
         第九十一回 纵淫心宝蟾工设计 布疑阵宝玉妄谈禅
         第九十二回 评女传巧姐慕贤良 玩母珠贾政参聚散
         第九十三回 甄家仆投靠贾家门 水月庵掀翻风月案
         第九十四回 宴海棠贾母赏花妖 失宝玉通灵知奇祸
         第九十五回 因讹成实元妃薨逝 以假混真宝玉疯颠
         第九十六回 瞒消息凤姐设奇谋 泄机关颦儿迷本性
         第九十七回 林黛玉焚稿断痴情 薛宝钗出闺成大礼
         第九十八回 苦绛珠魂归离恨天 病神瑛泪洒相思地
         第九十九回 守官箴恶奴同破例 阅邸报老舅自担惊
         第一百回 破好事香菱结深恨 悲远嫁宝玉感离情
         第一百一回 大观园月夜警幽魂 散花寺神签占异兆
         第一百二回 宁国府骨肉病灾浸 大观园符水驱妖孽
         第一百三回 施毒计金桂自焚身 昧真禅雨村空遇旧
         第一百四回 醉金刚小鳅生大浪 痴公子馀痛触前情
         第一百五回 锦衣军查抄宁国府 骢马使弹劾平安州
         第一百六回 王熙凤致祸抱羞惭 贾太君祷天消灾患
         第一百七回 散馀资贾母明大义 复世职政老沐天恩
         第一百八回 强欢笑蘅芜庆生辰 死缠绵潇湘闻鬼哭
         第一百九回 候芳魂五儿承错爱 还孽债迎女返真元
         第一百十回 史太君寿终归地府 王凤姐力诎失人心
         第百十一回 鸳鸯女殉主登太虚 狗彘奴欺天招伙盗
         第百十二回 活冤孽妙姑遭大劫 死雠仇赵妾赴冥曹
         第百十三回 忏宿冤凤姐托村妪 释旧憾情婢感痴郎
         第百十四回 王熙凤历幻返金陵 甄应嘉蒙恩还玉阙
         第百十五回 惑偏私惜春矢素志 证同类宝玉失相知
         第百十六回 得通灵幻镜悟仙缘 送慈柩故乡全孝道
         第百十七回 阻超凡佳人双护玉 欢聚党恶子独承家
         第百十八回 记微嫌舅兄欺弱女 警谜语妻妾谏痴人
         第百十九回 中乡魁宝玉却尘缘 沐皇恩贾家延世泽
         第百二十回 甄士隐详说太虚情 贾雨村归结红楼梦
         * pages : 1606
         * images : {"small":"https://img1.doubanio.com/view/subject/s/public/s1070959.jpg","large":"https://img1.doubanio.com/view/subject/l/public/s1070959.jpg","medium":"https://img1.doubanio.com/view/subject/m/public/s1070959.jpg"}
         * alt : https://book.douban.com/subject/1007305/
         * id : 1007305
         * publisher : 人民文学出版社
         * isbn10 : 702000220X
         * isbn13 : 9787020002207
         * title : 红楼梦
         * url : https://api.douban.com/v2/book/1007305
         * alt_title :
         * author_intro : 曹雪芹,（？-1763，一作1764）清小说家。名霑，字梦阮，号雪芹、芹圃、芹溪。为满洲正白旗“包衣”人。自曾祖起，三代任江宁织造，其祖曹寅尤为康熙帝所信用。雍正初年，在统计阶级内部政治斗争牵连下，雪芹家受到重大打击，其父免职，产业被抄，遂随家迁居北京。他早年经历了一段封建大官僚地主家庭的繁华生活，后因家道衰落，趋于艰困。晚期居北京西郊，贫病而卒，年未及五十。性情高傲，嗜酒健谈。具有深厚的文化修养和卓越的艺术才能。他生活在我国已有资本主义生产萌芽的封建末世，在其后期又有机会接触到下层人民，因而对当时社会阶级斗争和思想斗争有较具体的感受，看到了统治阶级的腐朽凶残和内部的分崩离析。曾以十年时间，从事《石头记》（即《红楼梦》）的创作。书中通过一个贵族官僚大家庭的盛衰历史的描写，塑造了许多典型人物形象，对当时社会的黑暗腐败，进行了深刻的解剖和批判，并热情地歌颂了具有异端思想的男女青年，成为我国古典小说中伟大的现实主义作品。但其中也反映了作者为封建制度“补天”的幻想和找不到出路的悲观情绪。据称先后曾增删五次，但未成全书而卒；今流行本一百二十回，后四十回一般认为是高鹗所续。也能诗，又善画石，但作品流传绝少。
         * summary : 《红楼梦》是一部百科全书式的长篇小说。以宝黛爱情悲剧为主线，以四大家族的荣辱兴衰为背景，描绘出18世纪中国封建社会的方方面面，以及封建专制下新兴资本主义民主思想的萌动。结构宏大、情节委婉、细节精致，人物形象栩栩如生，声口毕现，堪称中国古代小说中的经 典。
         由红楼梦研究所校注、人民文学出版社出版的《红楼梦》以庚辰（1760）本《脂砚斋重评石头记》为底本，以甲戌（1754）本、已卯（1759）本、蒙古王府本、戚蓼生序本、舒元炜序本、郑振铎藏本、红楼梦稿本、列宁格勒藏本（俄藏本）、程甲本、程乙本等众多版本为参校本，是一个博采众长、非常适合大众阅读的本子；同时，对底本的重要修改，皆出校记，读者可因以了解《红楼梦》的不同版本状况。
         红学所的校注本已印行二十五年，其间1994年曾做过一次修订，又十几年过去，2008年推出修订第三版，体现了新的校注成果和科研成果。
         关于《红楼梦》的作者，原本就有多种说法及推想，“前八十回曹雪芹著、后四十回高鹗续”的说法只是其中之一，这次修订中校注者改为“前八十回曹雪芹著；后四十回无名氏续，程伟元、高鹗整理”，应当是一种更科学的表述，体现了校注者对这一问题的新的认识。
         现在这个修订后的《红楼梦》是更加完善。
         * series : {"id":"106","title":"中国古典文学读本丛书"}
         * price : 59.70元
         */

        private RatingBean rating;
        private String subtitle;
        private String pubdate;
        private String origin_title;
        private String image;
        private String binding;
        private String catalog;
        private String pages;
        private ImagesBean images;
        private String alt;
        private String id;
        private String publisher;
        private String isbn10;
        private String isbn13;
        private String title;
        private String url;
        private String alt_title;
        private String author_intro;
        private String summary;
        private SeriesBean series;
        private String price;
        private List<String> author;
        private List<TagsBean> tags;
        private List<?> translator;

        public RatingBean getRating() {
            return rating;
        }

        public void setRating(RatingBean rating) {
            this.rating = rating;
        }

        public String getSubtitle() {
            return subtitle;
        }

        public void setSubtitle(String subtitle) {
            this.subtitle = subtitle;
        }

        public String getPubdate() {
            return pubdate;
        }

        public void setPubdate(String pubdate) {
            this.pubdate = pubdate;
        }

        public String getOrigin_title() {
            return origin_title;
        }

        public void setOrigin_title(String origin_title) {
            this.origin_title = origin_title;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getBinding() {
            return binding;
        }

        public void setBinding(String binding) {
            this.binding = binding;
        }

        public String getCatalog() {
            return catalog;
        }

        public void setCatalog(String catalog) {
            this.catalog = catalog;
        }

        public String getPages() {
            return pages;
        }

        public void setPages(String pages) {
            this.pages = pages;
        }

        public ImagesBean getImages() {
            return images;
        }

        public void setImages(ImagesBean images) {
            this.images = images;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getPublisher() {
            return publisher;
        }

        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }

        public String getIsbn10() {
            return isbn10;
        }

        public void setIsbn10(String isbn10) {
            this.isbn10 = isbn10;
        }

        public String getIsbn13() {
            return isbn13;
        }

        public void setIsbn13(String isbn13) {
            this.isbn13 = isbn13;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getAlt_title() {
            return alt_title;
        }

        public void setAlt_title(String alt_title) {
            this.alt_title = alt_title;
        }

        public String getAuthor_intro() {
            return author_intro;
        }

        public void setAuthor_intro(String author_intro) {
            this.author_intro = author_intro;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public SeriesBean getSeries() {
            return series;
        }

        public void setSeries(SeriesBean series) {
            this.series = series;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public List<String> getAuthor() {
            return author;
        }

        public void setAuthor(List<String> author) {
            this.author = author;
        }

        public List<TagsBean> getTags() {
            return tags;
        }

        public void setTags(List<TagsBean> tags) {
            this.tags = tags;
        }

        public List<?> getTranslator() {
            return translator;
        }

        public void setTranslator(List<?> translator) {
            this.translator = translator;
        }

        public static class RatingBean {
            /**
             * max : 10
             * numRaters : 132394
             * average : 9.6
             * min : 0
             */

            private int max;
            private int numRaters;
            private String average;
            private int min;

            public int getMax() {
                return max;
            }

            public void setMax(int max) {
                this.max = max;
            }

            public int getNumRaters() {
                return numRaters;
            }

            public void setNumRaters(int numRaters) {
                this.numRaters = numRaters;
            }

            public String getAverage() {
                return average;
            }

            public void setAverage(String average) {
                this.average = average;
            }

            public int getMin() {
                return min;
            }

            public void setMin(int min) {
                this.min = min;
            }
        }

        public static class ImagesBean {
            /**
             * small : https://img1.doubanio.com/view/subject/s/public/s1070959.jpg
             * large : https://img1.doubanio.com/view/subject/l/public/s1070959.jpg
             * medium : https://img1.doubanio.com/view/subject/m/public/s1070959.jpg
             */

            private String small;
            private String large;
            private String medium;

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }
        }

        public static class SeriesBean {
            /**
             * id : 106
             * title : 中国古典文学读本丛书
             */

            private String id;
            private String title;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }
        }

        public static class TagsBean {
            /**
             * count : 29157
             * name : 红楼梦
             * title : 红楼梦
             */

            private int count;
            private String name;
            private String title;

            public int getCount() {
                return count;
            }

            public void setCount(int count) {
                this.count = count;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }
        }
    }
}
