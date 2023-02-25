package com.puppy.witchcraft.game.view.pages;

import static com.puppy.witchcraft.common.CommonConstants.changePanel;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.puppy.witchcraft.common.MainFrame;
import com.puppy.witchcraft.game.controller.StorePageController;
import com.puppy.witchcraft.game.model.dto.ItemDTO;
import com.puppy.witchcraft.game.model.dto.PlayerDTO;
import com.puppy.witchcraft.game.view.StoreMenu;

public class storePage extends JPanel {

	private MainFrame mf;
	private JPanel storePage;
	private ItemDTO itemDTO;
	private PlayerDTO playerDTO;

	public storePage(MainFrame mf) {

		/* 현재 프레임 및 클래스 set */
		this.mf = mf;
		this.storePage = this;

		/* 라벨에 배경이미지 삽입 */
		JLabel background = new JLabel(new ImageIcon("images/background/bg_store.png"));
		background.setBounds(0, -15, 800, 580);

		/* 라벨에 상점재료리스트 이미지 삽입 */
		JLabel storePurchase = new JLabel(new ImageIcon("images/ui/storeitem_list.png"));
		storePurchase.setBounds(20, 30, 340, 400);

		/* 라벨에 재료인벤토리 이미지 삽입 */
		JLabel storeSell = new JLabel(new ImageIcon("images/ui/inventory_item.png"));
		storeSell.setBounds(425, 30, 340, 400);

		/* 라벨에 골드 이미지 삽입 */
		JLabel gold = new JLabel(new ImageIcon("images/ui/icon_gold.png"));
		gold.setBounds(635, 450, 25, 25);

		/* 라벨에 골드 텍스트필드 생성 */
		JLabel textId = new JLabel("     0G");
		textId.setBounds(660, 450, 110, 25);
		textId.setForeground(Color.WHITE);


		/* 라벨에 나가기 버튼 생성 후 나가기이미지 삽입 */
		JButton quitBtn = new JButton(new ImageIcon("images/ui/button_quit.png"));
		quitBtn.setBounds(0, 460, 170, 70);
		quitBtn.setContentAreaFilled(false);
		quitBtn.setBorder(null);

		/* 나가기 버튼 클릭 시 상점 첫 화면 패널로 변경*/
		quitBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				changePanel(mf, storePage, new StoreMenu(mf));
				System.out.println("상점 첫 화면 페이지로 이동");
			}
		});

		
		/* 라벨에 상점재료목록 이미지 삽입 */
		JLabel list = new JLabel(new ImageIcon("images/ui/store_list.png"));
		list.setBounds(40, 105, 300, 90);

		/* 상점 재료 담을 공간 패널로 생성 */
		JPanel storePanel = new JPanel();
		storePanel.setBounds(38, 102, 302, 302);
		storePanel.setBackground(new Color(255, 0, 0, 0));
		storePanel.setLayout(new GridLayout(3, 1, 0, 10)); 	//가로 세로 여백


		/* 재료가 있는 만큼 상점 내에 조회하도록 컨트롤러 요청 */
		StorePageController storePageController = new StorePageController();

		/* 임시플레이어 설정 */
		PlayerDTO pp = new PlayerDTO();
		pp.setPlayerNo(1);

		/*재료 리스트에 올리기 */
		List<ItemDTO> itemList = storePageController.item();

		for(int i = 0; i < 3; i++) {
			JButton blank = new JButton(); 
			blank.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					storePageController.buyItem();
				}
			});
			
			/* 아이템 이름 넣기 */
			JLabel itemName = new JLabel(itemList.get(i).getItemName()+"");
			itemName.setBounds(80, 10, 214, 17);
			blank.add(itemName);
			itemName.setForeground(Color.WHITE);
			
			/* 아이템 이미지 넣기 */
			JLabel imageUrl = new JLabel(new ImageIcon(storePageController.imageUrl(itemList.get(i).getImageNo())));
			imageUrl.setBounds(10, 10, 64, 64);
			blank.add(imageUrl);
			
			/* 아이템 설명 넣기 */
			JLabel itemInfo = new JLabel(itemList.get(i).getItemInfo()+"");
			itemInfo.setBounds(80, 20, 214, 51);
			blank.add(itemInfo);
			itemInfo.setForeground(Color.WHITE);
			
			/* 골드 이미지 넣기 */
			JLabel goldImage = new JLabel(new ImageIcon("images/ui/icon_gold.png"));
			goldImage.setBounds(230, 55, 30, 30);
			blank.add(goldImage);
			
			/* 아이템 가격 넣기 */
			JLabel goldPrice = new JLabel(itemList.get(i).getItemBuy()+"G");
			goldPrice.setBounds(260, 65, 50, 10);
			blank.add(goldPrice);
			goldPrice.setForeground(Color.WHITE);


			blank.setName(itemList.get(i).getItemNo()+"");
			blank.setLayout(null);
			blank.setSize(302, 93);
			blank.setBackground(Color.DARK_GRAY);
			storePanel.add(blank);


		}

		/* 컴포넌트들 넣을 패널 생성 */
		this.setLayout(null);
		this.setBounds(0, 0, 800, 580);

		/* 패널에 컴포넌트들 삽입 */
		this.add(storePanel);
		this.add(list);
		this.add(storePurchase);
		this.add(storeSell);
		this.add(gold);
		this.add(textId);
		this.add(quitBtn);
		this.add(background);


		/* 프레임에 패널 올리기 */
		mf.add(this);

		/* 배경이미지 레이어위치 맨뒤로 보내기 */
		mf.getLayeredPane().setLayer(background, 0);

	}
}