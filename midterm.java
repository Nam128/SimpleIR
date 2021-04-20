package data;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.snu.ids.kkma.index.Keyword;
import org.snu.ids.kkma.index.KeywordExtractor;
import org.snu.ids.kkma.index.KeywordList;
import org.snu.ids.kkma.ma.MExpression;
import org.snu.ids.kkma.ma.MorphemeAnalyzer;
import org.snu.ids.kkma.ma.Sentence;
import org.snu.ids.kkma.util.Timer;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


public class midterm {

	public static void main(String[] args) throws Throwable {
		
		matest();
		
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
		title.appendChild(doc.createTextNode("��"));
		doca.appendChild(title);
		
		Element body = doc.createElement("body");
		body.appendChild(doc.createTextNode("���� �ַ� ����̳� ����, �Ǵ� �ٸ� ����� �Ǽ� ���ų� ���� ���� �Ǽ� ���� ���� ������ ��Ī�ϴ� ���̴�.\n"
				+ "            �Ϲ������δ� ���� ������ ��������� ���� �츻�̳� ��Ÿ ��� �̿��ϱ⵵ �ϰ�, ���� ����� ���ϱ� ���ؼ� �پ��� ������ �������� �߰��Ǳ⵵ �Ѵ�.\n"
				+ "            �����ƽþƿ� ���ϾƽþƸ� �߽����� ���� �ֽ����� �Դ� �������� �ߴ��Ͽ���.\n"
				+ "            �ѱ������� �����̳� ��ȥ���� ���� ��ġ�� ���� ��翡�� ���� ���� ���� �Դ´�.\n"
				+ "            ���� ����� ����� ���� ���� ���� ������ ���� �ִ�.\n"
				+ "            ũ�� ����� ������� ������ �� ��, ģ ��, ���� ��, ���� �� �̷��� �� ���� ������ �ȴ�.\n"
				+ "            ��ҷ� �� ���������� �̾� ���� ������, �Ұ��縦 �÷翡 �Ǽ� ���� �÷綱, ���ҷ� ���� ���Ҷ�, �����縦 ���� ����, ������ ������ ��ä�ο� ���� ������ ���� ��������, �ݴ� ������� �ӿ� �Ҹ� �־� ���� ����, ���Ҷ��� ���� ���� ���� ������, ���� ���� ����, ��, ���� ���� ����� ��, ��� �������� ���� ���� ���Ұ� ����� ���� ���� �����縦 ����� Ȳ������ �־�� �ܶ� ��Ұ��翡 ���ɸ��� �־� ��Ǯ�� �� ���� ���� �ִ�.\n"
				+ "            �������� ���� �� ������ �־� �԰� ������ �߼� �� ���� ���� �Դ´�.\n"
				+ "            �ѱ� ��ȸ������ '����'�̶�� ������ ���� �ؼ� ������� ���� �ְ� �޴� ǳ���� �־��µ� ���� ���� �Ǹ� �ƹ��� ���� ������ ���� ���߾� ���ͻ� �÷ȱ� �����̴�.\n"
				+ "            ��3��ȭ���� ���ʽ���� ���� �������� �������� 'ȿ����'��� ������� �Ҿ��� ���� ��� ���������� �����Ͽ��µ� �̰��� �����̶�� �ҷ���.\n"
				+ "            ���� ȥ�ʳ� �̻�� ���� ���� �Ͽ��� ���� �� �ʿ��ߴµ� ���� �μ� ������� ���ݾ� ���� ��� �����ϸ鼭 �������� ����� ���ϱ⵵ �Ͽ���.\n"
				+ "            �׷���, ���� �ǹ̰� ����Ǿ� ���ذ����ڿ��� ���Ŀ� ȣ���� ��ó���� ���������� ��Ź�ϴ� ������ �����̶�� ���� ���Ǳ⵵ �Ѵ�.\n"
				+ "            �ֱٿ��� ���� ���� ���� �����ص� �������� ������, �ԱⰡ �����ؼ� ��ħ�Ļ� ������� ���Ǳ⵵ �ϸ� �� ����ũ�� ���� ǻ������ �����ϰ� �ִ�.\n"
				+ "            �׸��� ���� ���� ������ ������ �Ǹ��ϰ� �������� ���׸���� �����Ų ��ī�䰡 ���ܳ��� �ִ�."));
		doca.appendChild(body);
		//
		
		Element doca1 = doc.createElement("doc");
		docs.appendChild(doca1);
		
		doca1.setAttribute("id", "1");
		
		Element title1 = doc.createElement("title");
		title1.appendChild(doc.createTextNode("���"));
		doca1.appendChild(title1);
		
		Element body1 = doc.createElement("body");
		body1.appendChild(doc.createTextNode("����� �а���� �ް� �׸��� ���� �ҷ��� �ұ� ���� �־� �����Ͽ� ���� ���� �̰� �� �� ��� Ƣ�ܼ� �츻�� ����ȭ�� ���� ���� �߰ſ� ���� �ٽ� ���� �� �ִ� ���·� ��������� �����̴�.\n"
				+ "            ��� �Բ� �и������� �Ǵ��⽺���� ������ ��ǰ�� �Ϲ����̴�. ����� �߱����� ���� ��� �ķ����� �� ������ �����ȴ�. ��� �Ϻ��� ���������� �ϸ鼭 ��� �Դٴ� ���� �ִ�.\n"
				+ "            ������ ����� ��2�� ���� ������ ���� �� �Ϻ����� �븸�� �Ϻ����� �ȵ� ������� �߸��Ͽ��ٰ� �Ѵ�.\n"
				+ "            ��� �̱� ��ȣǰ���� �а��簡 ���� �־��� ������ �̸� �̿��� ���ο� ��ǰ�� ����ϰ� �Ǿ���.\n"
				+ "            �а���� ������ ����� �⸧�� Ƣ�� ���� ���� ������ ���ߵǰ� ���� �߰ſ� ���� ���� �Ǹ� ������ ���·� Ǯ���� �Ա� ���� ���°� �Ǵ� ���̴�.\n"
				+ "            ������ �Ｎ ����� 1958�� 8�� 25�Ͽ� ���� �ֽŽ�ǰ�� ������ ��ü���꿡�� ������ ġŲ����̾���.\n"
				+ "            �ʱ� ����� ����� �鿡 ������ ���¿����� ���� 1962�⿡ ������ �и��� ����� ���� ÷���� ������ �������� �α⸦ ���� �Ǿ���.\n"
				+ "            ����ǰ â���� ������ ȸ���� �Ϻ��� ���� ��ǰ���κ��� ���� ��������� �޾� ó������ ����� ����� �ȱ� �����ߴ�.\n"
				+ "            ���� ��� ����� ������ 10���̾���. ó������ �����Ͽ� �ǸŰ� ����������, ���� �ý�ȸ���� �� ���� ���������� �� ���ε��� �������� �����ް� �Ǿ���.\n"
				+ "            1960��� ���δ� �� �������� �ذ��� ���� ����� �а��� ������ �����ϴ� ��å�� �ǽ��ߴµ�, �� ��å ���п� ����� ���� �ȸ� ���ۿ� ������.\n"
				+ "            �� ���� ��ʷ� 1969�⿡ �� �� ���� õ ���鸸 ������ �ȷȴ�.\n"
				+ "            1970�⿡ ���� �Ｎ ¥���, Į����, �ø� ���� �پ��� ��ǰ�� ���Դ�.\n"
				+ "            �� �ѽĿ� �°� ���ѹα��� ��ȭ�� �˸°� ���� �������� ��õǾ���.\n"
				+ "            1982�� 11�� 17�� �������߸��� ��ø� �������� ��⿡ ���� �߰ſ� ���� �ξ� �Դ� �Ŷ���� �α⸦ ���� �����Ͽ���.\n"
				+ "            ���� «�Ͷ��, ������, ����, �Ҷ�� �� �پ��� ������ ����� ��õǰ� �ִ�."));
		doca1.appendChild(body1);
		//
		
		Element doca2 = doc.createElement("doc");
		docs.appendChild(doca2);
		
		doca2.setAttribute("id", "2");
		
		Element title2 = doc.createElement("title");
		title2.appendChild(doc.createTextNode("���̽�ũ��"));
		doca2.appendChild(title2);
		
		Element body2 = doc.createElement("body");
		body2.appendChild(doc.createTextNode("���̽�ũ���� ������ ����Ʈ�� ���� ũ���� ��ŷ�� ��ǰ�� �� �������� �ְ� �� �����̴�.\n"
				+ "            ���̽�ũ���� ����� ������ ������ Iced Cream �Ǵ� Cream Ice���� �����Ǿ���.\n"
				+ "            ���� ���̽�ũ���� ���� ���� ���� ����ϴ� ��ῡ�� �ٴҶ�, ���ݸ�, ����, �ٳ��� ���� ��ᰡ �ִ�.\n"
				+ "            ������ ���̽�ũ���� �Ź� ���·κ��� ����Ͽ���.\n"
				+ "            ������ ���̽�ũ���� ���� ���� ����� �� ������ ������ ���̽�ũ�����ٴ� ��ĥ����.\n"
				+ "            ����� ���� �ù� ������ ������ ��뿡�� ������ �������� �Դ� ��� �����̾���.\n"
				+ "            ����� 400��� ��� �丣�þƿ��� ���� ���� �����صξ��ٰ� ������ �ܿ￡ �Ľ�Ÿ�� ������ ������ÿ���� ��̼��� ������ ���� ���� ����, ���� ��� ���� ���� ����̶�� ���� ������, �����콺�� �˷���� ����� ���� ������ ���� ���� ���� ���� ����̶�� ���� �ִ�.\n"
				+ "            �׸��������� ���׳� ���忡�� ���� ���� ���� ���̽�ũ���� �ȾҴٴ� ��ϵ� ������, ����ũ���׽��� ���̽�ũ���� '�����'�� �Ҹ���, �����Ͽ���.\n"
				+ "            �θ� ������ �׷� Ȳ���� ���� ���⼳���� ������ ���� ��, ����, ���� ��� ���� ���� ��� �Ծ��ٰ� �Ѵ�.\n"
				+ "            ������ �̿��� ���̽�ũ���� ��� �߱��� �󳪶󿡼� ���� ���� �̿��� ���̽�ũ���� ������� �Ѵ�.\n"
				+ "            ������ ������ ���δ� �����󿡼� ���̽�ũ���� �Ծ�ôٰ� �Ѵ�.\n"
				+ "            �̰��� �������� �ǳʰ��� 1550�� ���ƿ� ������ ���̽�ũ���� ������ ������ ���̽�ũ���� �ϼ��Ǿ���."));
		doca2.appendChild(body2);
		
		
		Element doca3 = doc.createElement("doc");
		docs.appendChild(doca3);
		
		doca3.setAttribute("id", "3");
		
		Element title3 = doc.createElement("title");
		title3.appendChild(doc.createTextNode("�ʹ�"));
		doca3.appendChild(title3);
		
		Element body3 = doc.createElement("body");
		body3.appendChild(doc.createTextNode("�ʹ��� ���ʿ� ������ ���� ȸ, ä��, ����� ���� ��ų� ä���� ����� �Ϻ� �丮�̴�.\n"
				+ "            ������ ���濡���� ���ڿ� ��� ������ �ְ� ���� ���� ����� ���� ���� �׸𳪰� �� �Ծ���.\n"
				+ "            ���� �������Ͽ� ������� �Ǵ� ���ڿ� �ִ´� �Ͽ� ������ö󵵰� �θ���.\n"
				+ "            ������ �Ϻ� �ʹ��� ������ ��� ����� ������ �ϱ⸮��ö�� �θ��⵵ �ϰ�, �������� ����������Ͽ� ����������ö�� �θ���.\n"
				+ "            ���ö�� �̸��� ���� ��ȿ�� �������� �Ÿ��� ���� ������ �ٿ����ٴ� ���ص� �ִµ�, 16���� ���� ���� ���ʰ� �����ϸ鼭 17���� ������ ��ȿ ��� ���ʸ� ����Ͽ� ���������� ��ġ�� ���� ���ð� ��������� 1820�� �濡 ������ �ʹ��� ���ս�Ű�� ����� ���ð� ���ܳ���.\n"
				+ "            �� ����µ� 2~3�� �ɸ��� ���ý��ø� ������ ����� ���ؼ� ���ʸ� ġ�� ���� �ؼ� ����� �´�.\n"
				+ "            �ű⿡ �������ڿ� ä���ְ� �����δ� ������ ��ٸ� �� ���� ���� ������ ���� ���� �� ������ ������ ���� �Ͼ���ð� ���ܳ���.\n"
				+ "            �׷��� ���ݵ� ���ø� ����ٰ� ���� �ʰ� ����ó�� ��ٴٴ� ǥ���� ����ϰ�, ���� �Ĵ� �ֹ��� '��״� ���'��� �θ��� �ִ�.\n"
				+ "            �ʹ信 ���Ǵ� ������ ���� Ȱ� �ƴϰ� �����̴�.\n"
				+ "            �ʹ��� �������� �ϱ⸮���, ��Ű���, ġ������, �������, �̳������, Ķ�����Ͼ� ���� �ִ�."));
		doca3.appendChild(body3);
		
		
		Element doca4 = doc.createElement("doc");
		docs.appendChild(doca4);
		
		doca4.setAttribute("id", "4");
		
		Element title4 = doc.createElement("title");
		title4.appendChild(doc.createTextNode("�Ľ�Ÿ"));
		doca4.appendChild(title4);
		
		Element body4 = doc.createElement("body");
		body4.appendChild(doc.createTextNode("�Ľ�Ÿ�� ��â��Ų �а��� ���׿� ���̳� ����� ��� �� ���¸� ����� �پ��� ������� ���� �� ���̰ų� ������ �Դ� �����̴�.\n"
				+ "            ��Ư�� �İ��̳� ���� ���ų� �۷����� �������� �ʱ� ���� �а��縦 ����ؼ� ���̳� ������� ���� ������ �Ұ��縦 ����ϴ� ��쵵 �ִ�.\n"
				+ "            �Ľ�Ÿ�� ��Ż���� �丮�� �ֽ��̴�.\n"
				+ "            �Ľ�Ÿ�� ũ�� ��ī��� �Ҹ��� �Ǹ�� ������ī��� �Ҹ��� �������� ������.\n"
				+ "            ��κ��� �Ǹ� �Ľ�Ÿ�� ���⼺�� ������ ���� ��������� ���������, �������� ���� �� �ִ�.\n"
				+ "            ���� �Ľ�Ÿ�� ��� ���������� ���۾��� ���� ���������, ������ ������ ����� ������ �ޱ⵵ �Ѵ�.\n"
				+ "            �ķ�ǰ ���Կ��� �����ϴ� ���� �Ľ�Ÿ�� ��迡 ���� ��������� ����ȴ�.\n"
				+ "            �Ǹ� �Ľ�Ÿ�� ���� �Ľ�Ÿ ��� �پ��� ���� ������ ������ �ִ�.\n"
				+ "            �Ľ�Ÿ�� ��ü���� ���´� 310����, ��ϵ� �Ľ�Ÿ�� �̸��� 1,300���� �Ѵ´�.\n"
				+ "            ��Ż���ƿ��� �Ϻ� �Ľ�Ÿ�� ����̳� ������ ������ ���� �پ��ϴ�.\n"
				+ "            �Ľ�Ÿ�� �Ϲ����� ����� �� ����, ª�� ����, Ʃ��, ������ ����, ��Ʈ, ������ ���� �̴Ͼ�ó ����, ���� ä��� ����, ���� Ư��ǰ, �Ǵ� ���ǰ ���� ���Եȴ�.\n"
				+ "            ��Ż���� �丮 �� �ϳ��ν�, �Ǹ� �Ľ�Ÿ�� ���� �Ľ�Ÿ�� 3���� ���� �� �ϳ��� ���´�.\n"
				+ "            �Ľ�Ÿ �ƽÿ�Ÿ�� ������ �Ľ�Ÿ�� �ҽ��� ���̷ᰡ ��鿩�� ���´�. �Ľ�Ÿ �κ�ε��� ���� ����� �׸��� ������ �Ľ�Ÿ�̴�.\n"
				+ "            ���������� �Ľ�Ÿ �� ������� �Ľ�Ÿ�� ���� �ȿ� �� ������, ���ÿ� �Ľ�Ÿ�� �Բ� ���쿡�� ������ �����̴�."));
		doca4.appendChild(body4);
		
		
		
		// xml ����
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();

		transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");	
		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(new FileOutputStream(new File("collection.xml")));

		transformer.transform(source, result);
		
		} catch (Exception e) {
			
		}
		
		
		
		//Ű���� ���ξ� ����
		String testString = "���������¼Һм��⸦�׽�Ʈ�ϰ��־��. �׽�Ʈ��������Կ�.";
		// init KeywordExtractor
		KeywordExtractor ke = new KeywordExtractor();
		// extract keywords
		KeywordList kl = ke.extractKeyword(testString,  true);
		// print result
		for(int i = 0; i < kl.size(); i++) {
			Keyword kwrd = kl.get(i);
			System.out.println(kwrd.getString() + "\t" + kwrd.getCnt());
		}
	}
	
		//���¼� �м�
		public static void matest() throws Throwable {
	      {
	            String string = "�ƹ������濡���̴�.";
	            {
	                  MorphemeAnalyzer ma = new MorphemeAnalyzer();
	                  ma.createLogger(null);
	                  Timer timer = new Timer();
	                  timer.start();
	                  List<MExpression> ret = ma.analyze(string);
	                  timer.stop();
	                  timer.printMsg("Time");
	                  ret = ma.postProcess(ret);
	                  ret = ma.leaveJustBest(ret);
	                  List<Sentence> stl = ma.divideToSentences(ret);
	                  for( int i = 0; i < stl.size(); i++ ) {
	                        Sentence st = stl.get(i);
	                        System.out.println("=============================================  " + st.getSentence());
	                        for( int j = 0; j < st.size(); j++ ) {
	                              System.out.println(st.get(j));
	                        }
	                  }
	                  ma.closeLogger();
	            } 
	      }
	}
}
