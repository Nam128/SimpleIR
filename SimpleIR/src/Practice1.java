import java.io.File;
import java.io.FileOutputStream;
import java.io.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Practice1 {

	public static void main(String[] args) {
		try {
			
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
		
		Document doc = docBuilder.newDocument();
		
		Element docs = doc.createElement("docs");
		doc.appendChild(docs);
		
		Element doca = doc.createElement("doc");
		docs.appendChild(doca);
		
		doca.setAttribute("id", "0");
		
		Element title = doc.createElement("title");
		title.appendChild(doc.createTextNode("떡"));
		doca.appendChild(title);
		
		Element body = doc.createElement("body");
		body.appendChild(doc.createTextNode("떡은 주로 멥쌀이나 찹쌀, 또는 다른 곡식을 쪄서 찧거나 가루 내어 쪄서 빚어 만든 음식을 통칭하는 말이다.\n"
				+ "            일반적으로는 쌀을 주재료로 사용하지만 감자 녹말이나 기타 곡물을 이용하기도 하고, 맛과 모양을 더하기 위해서 다양한 종류의 부재료들이 추가되기도 한다.\n"
				+ "            동남아시아와 동북아시아를 중심으로 쌀을 주식으로 먹는 지역에서 발달하였다.\n"
				+ "            한국에서는 명절이나 관혼상제 같은 잔치나 축제 행사에서 떡을 많이 지어 먹는다.\n"
				+ "            재료와 만드는 방법에 따라 아주 많은 종류의 떡이 있다.\n"
				+ "            크게 만드는 방법으로 나누면 찐 떡, 친 떡, 지진 떡, 삶은 떡 이렇게 네 가지 종류가 된다.\n"
				+ "            멥쌀로 긴 원통형으로 뽑아 만든 가래떡, 쌀가루를 시루에 쪄서 만든 시루떡, 찹쌀로 만든 찹쌀떡, 감가루를 넣은 감떡, 무지개 색으로 다채로운 색의 층으로 만든 무지개떡, 반달 모양으로 속에 소를 넣어 만든 송편, 찹쌀떡에 고물을 묻혀 만든 인절미, 쑥을 넣은 쑥떡, 밀, 보리 등의 잡곡의 겨, 찌끼를 버무려서 만든 개떡 찹쌀과 멥쌀을 각각 빻아 고른가루를 만들어 황설탕을 넣어만든 꿀떡 멥쌀가루에 막걸리를 넣어 부풀려 찐 술떡 등이 있다.\n"
				+ "            가래떡은 설날 때 떡국에 넣어 먹고 송편은 추석 때 많이 빚어 먹는다.\n"
				+ "            한국 사회에서는 '떡값'이라며 명절에 떡을 해서 먹으라고 돈을 주고 받는 풍습이 있었는데 명절 때가 되면 아무리 돈이 없더라도 떡을 맞추어 차롓상에 올렸기 때문이다.\n"
				+ "            제3공화국에 보너스라는 것이 없었지만 명절에는 '효도비'라는 명목으로 소액의 돈을 모든 공무원에게 지급하였는데 이것을 떡값이라고도 불렀다.\n"
				+ "            또한 혼례나 이사와 같은 좋은 일에도 떡이 꼭 필요했는데 같은 부서 사람들이 조금씩 돈을 모아 부조하면서 떡값으로 쓰라고 말하기도 하였다.\n"
				+ "            그러나, 좋은 의미가 퇴색되어 이해관계자에게 향후에 호의적 일처리를 간접적으로 부탁하는 뇌물로 떡값이라는 말이 사용되기도 한다.\n"
				+ "            최근에는 떡이 적은 양을 섭취해도 포만감이 빠르며, 먹기가 간편해서 아침식사 대용으로 사용되기도 하며 떡 케이크와 같이 퓨전떡이 출현하고 있다.\n"
				+ "            그리고 예쁜 떡을 소포장 단위로 판매하고 현대적인 인테리어와 접목시킨 떡카페가 생겨나고 있다."));
		doca.appendChild(body);
		//
		
		Element doca1 = doc.createElement("doc");
		docs.appendChild(doca1);
		
		doca1.setAttribute("id", "1");
		
		Element title1 = doc.createElement("title");
		title1.appendChild(doc.createTextNode("라면"));
		doca1.appendChild(title1);
		
		Element body1 = doc.createElement("body");
		body1.appendChild(doc.createTextNode("라면은 밀가루와 달걀 그리고 물과 소량의 소금 등을 넣어 반죽하여 굵은 면을 뽑고 한 번 삶아 튀겨서 녹말이 알파화한 면이 이후 뜨거운 물에 다시 먹을 수 있는 상태로 만들어지는 형태이다.\n"
				+ "            면과 함께 분말스프와 건더기스프로 구성된 제품이 일반적이다. 라면은 중국에서 전시 비상 식량으로 쓴 것으로 유래된다. 당시 일본이 중일전쟁을 하면서 배워 왔다는 설이 있다.\n"
				+ "            현재의 라면은 제2차 세계 대전이 끝난 뒤 일본에서 대만계 일본인인 안도 모모후쿠가 발명하였다고 한다.\n"
				+ "            당시 미군 구호품으로 밀가루가 많이 있었기 때문에 이를 이용한 새로운 식품을 고안하게 되었다.\n"
				+ "            밀가루로 국수를 만들어 기름에 튀겨 국수 안의 수분이 증발되고 이후 뜨거운 물에 들어가게 되면 본래의 상태로 풀어져 먹기 좋은 상태가 되는 것이다.\n"
				+ "            최초의 즉석 라면은 1958년 8월 25일에 현재 닛신식품의 전신인 산시쇼쿠산에서 생산한 치킨라면이었다.\n"
				+ "            초기 라면은 양념이 면에 더해진 형태였으나 이후 1962년에 스프를 분말로 만들고 따로 첨부한 형태의 봉지면이 인기를 끌게 되었다.\n"
				+ "            삼양식품 창립자 전중윤 회장은 일본의 묘조 식품으로부터 무상 기술원조를 받아 처음으로 라면을 만들어 팔기 시작했다.\n"
				+ "            또한 당시 라면의 가격은 10원이었다. 처음에는 생소하여 판매가 부진했지만, 무료 시식회에서 그 맛을 인정받으며 곧 서민들의 음식으로 각광받게 되었다.\n"
				+ "            1960년대 정부는 쌀 부족문제 해결을 위해 잡곡밥과 밀가루 음식을 강제하는 정책을 실시했는데, 그 정책 덕분에 라면은 많이 팔릴 수밖에 없었다.\n"
				+ "            그 실제 사례로 1969년에 한 해 동안 천 오백만 봉지가 팔렸다.\n"
				+ "            1970년에 들어서는 즉석 짜장면, 칼국수, 냉면 등의 다양한 제품이 나왔다.\n"
				+ "            또 한식에 맞고 대한민국의 문화에 알맞게 만든 된장라면이 출시되었다.\n"
				+ "            1982년 11월 17일 육개장사발면의 출시를 시작으로 용기에 직접 뜨거운 물을 부어 먹는 컵라면이 인기를 끌기 시작하였다.\n"
				+ "            이후 짬뽕라면, 비빔라면, 라볶이, 쌀라면 등 다양한 종류의 라면이 출시되고 있다."));
		doca1.appendChild(body1);
		//
		
		Element doca2 = doc.createElement("doc");
		docs.appendChild(doca2);
		
		doca2.setAttribute("id", "2");
		
		Element title2 = doc.createElement("title");
		title2.appendChild(doc.createTextNode("아이스크림"));
		doca2.appendChild(title2);
		
		Element body2 = doc.createElement("body");
		body2.appendChild(doc.createTextNode("아이스크림은 차가운 디저트로 보통 크림에 향신료와 거품을 낸 흰자위를 넣고 얼린 음식이다.\n"
				+ "            아이스크림의 어원은 옛날식 영어인 Iced Cream 또는 Cream Ice에서 유래되었다.\n"
				+ "            또한 아이스크림에 맛을 내기 위해 사용하는 향료에는 바닐라, 초콜릿, 딸기, 바나나 등의 향료가 있다.\n"
				+ "            최초의 아이스크림은 셔벗 형태로부터 출발하였다.\n"
				+ "            최초의 아이스크림은 눈에 향료로 양념을 한 것으로 지금의 아이스크림보다는 거칠었다.\n"
				+ "            냉장고 같은 냉방 수단이 없었던 고대에는 왕족과 귀족들이 먹는 고급 간식이었다.\n"
				+ "            기원전 400년경 고대 페르시아에서 눈이 오면 보존해두었다가 차가운 겨울에 파스타의 일종인 베르미첼리에 장미수를 버무린 것을 향료와 과일, 눈을 얹어 먹은 것이 기원이라는 설이 있으며, 율리우스와 알렉산더 대왕이 눈에 우유와 꿀을 섞어 먹은 것이 기원이라는 설도 있다.\n"
				+ "            그리스에서는 아테네 시장에서 눈과 꿀을 섞은 아이스크림을 팔았다는 기록도 있으며, 히포크라테스도 아이스크림을 '생명수'라 불리며, 극찬하였다.\n"
				+ "            로마 제국의 네로 황제도 산의 만년설에서 가져온 눈을 꿀, 땅콩, 과일 등과 섞은 것을 즐겨 먹었다고 한다.\n"
				+ "            우유를 이용한 아이스크림은 고대 중국의 상나라에서 물소 젖을 이용한 아이스크림을 기원으로 한다.\n"
				+ "            실제로 마르코 폴로는 원나라에서 아이스크림을 먹어봤다고 한다.\n"
				+ "            이것이 유럽으로 건너가서 1550년 무렵에 지금의 아이스크림과 유사한 형태의 아이스크림이 완성되었다."));
		doca2.appendChild(body2);
		
		
		Element doca3 = doc.createElement("doc");
		docs.appendChild(doca3);
		
		doca3.setAttribute("id", "3");
		
		Element title3 = doc.createElement("title");
		title3.appendChild(doc.createTextNode("초밥"));
		doca3.appendChild(title3);
		
		Element body3 = doc.createElement("body");
		body3.appendChild(doc.createTextNode("초밥은 식초와 버무린 밥을 회, 채소, 계란을 위에 얹거나 채워서 만드는 일본 요리이다.\n"
				+ "            간사이 지방에서는 상자에 밥과 생선을 넣고 돌로 눌러 모양을 만든 다음 네모나게 썰어서 먹었다.\n"
				+ "            돌로 누른다하여 오시즈시 또는 상자에 넣는다 하여 하코즈시라도고 부른다.\n"
				+ "            현대의 일본 초밥은 손으로 쥐어 만들기 때문에 니기리즈시라고 부르기도 하고, 에도에서 만들어졌다하여 에도마에즈시라고 부른다.\n"
				+ "            스시라는 이름은 본래 발효된 생선에서 신맛이 났기 때문에 붙여졌다는 견해도 있는데, 16세기 이후 양조 식초가 발전하면서 17세기 생선의 발효 대신 식초를 사용하여 숙성과정을 거치지 않은 스시가 만들어졌고 1820년 경에 생선과 초밥을 조합시키는 현대식 스시가 생겨났다.\n"
				+ "            즉 만드는데 2~3일 걸리는 오시스시를 빠르게 만들기 위해서 식초를 치고 간을 해서 만들어 냈다.\n"
				+ "            거기에 나무상자에 채워넣고 눌러두는 것조차 기다릴 수 없어 밥을 손으로 눌러 만든 후 조미한 생선을 얹은 하야즈시가 생겨났다.\n"
				+ "            그러나 지금도 스시를 만든다고 하지 않고 젓갈처럼 담근다는 표현을 사용하고, 스시 식당 주방을 '담그는 장소'라고 부르고 있다.\n"
				+ "            초밥에 사용되는 생선은 보통 활어가 아니고 선어이다.\n"
				+ "            초밥의 종류에는 니기리즈시, 마키즈시, 치라시즈시, 오시즈시, 이나리즈시, 캘리포니아 롤이 있다."));
		doca3.appendChild(body3);
		
		
		Element doca4 = doc.createElement("doc");
		docs.appendChild(doca4);
		
		doca4.setAttribute("id", "4");
		
		Element title4 = doc.createElement("title");
		title4.appendChild(doc.createTextNode("파스타"));
		doca4.appendChild(title4);
		
		Element body4 = doc.createElement("body");
		body4.appendChild(doc.createTextNode("파스타는 팽창시킨 밀가루 반죽에 물이나 계란을 섞어서 판 형태를 비롯한 다양한 모양으로 만든 뒤 끓이거나 구워서 먹는 음식이다.\n"
				+ "            독특한 식감이나 맛을 내거나 글루텐을 섭취하지 않기 위해 밀가루를 대신해서 콩이나 렌즈콩과 같은 협과나 쌀가루를 사용하는 경우도 있다.\n"
				+ "            파스타는 이탈리아 요리의 주식이다.\n"
				+ "            파스타는 크게 세카라고 불리는 건면과 프레스카라고 불리는 생면으로 나뉜다.\n"
				+ "            대부분의 건면 파스타는 압출성형 공법을 통해 상업적으로 생산되지만, 집에서도 만들 수 있다.\n"
				+ "            생면 파스타의 경우 전통적으로 수작업을 통해 만들어지며, 때때로 간단한 기계의 도움을 받기도 한다.\n"
				+ "            식료품 가게에서 구입하는 생면 파스타는 기계에 의해 상업적으로 생산된다.\n"
				+ "            건면 파스타와 생면 파스타 모두 다양한 모양과 변형을 가지고 있다.\n"
				+ "            파스타의 구체적인 형태는 310개로, 기록된 파스타의 이름은 1,300개가 넘는다.\n"
				+ "            이탈리아에서 일부 파스타의 모양이나 종류는 지역에 따라 다양하다.\n"
				+ "            파스타의 일반적인 모양은 긴 형태, 짧은 형태, 튜브, 납작한 형태, 시트, 수프를 위한 미니어처 형태, 속을 채우는 형태, 지역 특산품, 또는 장식품 등이 포함된다.\n"
				+ "            이탈리아 요리 중 하나로써, 건면 파스타와 생면 파스타는 3가지 종류 중 하나로 나온다.\n"
				+ "            파스타 아시우타는 조리된 파스타로 소스나 조미료가 곁들여져 나온다. 파스타 인브로도는 수프 모양의 그릇에 나오는 파스타이다.\n"
				+ "            마지막으로 파스타 알 포르노는 파스타가 접시 안에 든 것으로, 접시와 파스타가 함께 오븐에서 구워진 형태이다."));
		doca4.appendChild(body4);
		
		
		
		// xml 생성
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();

		transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");	
		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(new FileOutputStream(new File("collection.xml")));

		transformer.transform(source, result);
		
		} catch (Exception e) {
			
		}
	}

}
