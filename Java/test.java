//
//    while (true) {
//      try {
//        System.out.println();
//        int menuNo = doMainMenu();
//
//        if (menuNo == 0) {
//          break;
//        } else if (menuNo == 1) {
//          doVolunteerMenu();
//        } else if (menuNo == 2) {
//          doCommunityMenu();
//        } else if (menuNo == 3) {
//          doChallengeMenu();
//        } else if (menuNo == 4) {
//          doDonationMenu();
//        } else if (menuNo == 5) {
//          doSupportMenu();
//        } else if (menuNo == 6) {
//          doMyPageMenu();
//        } else if (menuNo == 7) {
//          doAdminPageMenu();
//        } else {
//          System.out.println("메뉴 번호가 유효하지 않습니다.");
//        }
//        System.out.println();
//      } catch (Throwable e) {
//        System.out.println("--------------------------------------------------------------");
//        System.out.printf("오류 발생: %s\n", e.getClass().getName());
//        System.out.println("--------------------------------------------------------------");
//      }
//    }
//    Prompt.close();
//  }
//
//  static void doVolunteerMenu() {
//    while (true) {
//      System.out.println();
//
//      System.out.println("[메인/ 함께해요]");
//      System.out.println("1. 봉사신청");
//      System.out.println("2. 봉사목록");
//      System.out.println("3. 봉사참여");
//      System.out.println("0. 이전메뉴");
//
//      int menuNo = Prompt.inputInt("함께해요> ");
//
//
//      switch (menuNo) {
//        case 1: volListHandler.volAuthForm();break;
//        case 2: volListHandler.volApprovedList(); break;
//        case 3: volListHandler.volJoin(); break;
//        case 0: return;
//        default:
//          System.out.println("무효한 메뉴 번호입니다.");
//      }
//      System.out.println();
//    } 
//
//  }
//
//  static void doCommunityMenu() {
//    while (true) {
//      System.out.println();
//
//      System.out.println("[메인/ 소통해요]");
//
//      System.out.println("1. 나눔이야기");
//      System.out.println("2. 나눔이야기Best");
//      System.out.println("3. 한줄후기");
//      System.out.println("0. 이전메뉴");
//
//      int menuNo = Prompt.inputInt("소통해요> ");
//      switch (menuNo) {
//        case 1: commHandler.commBoard(); break;
//        case 2: commHandler.commBest(); break;
//        case 3: commHandler.commReview(); break;
//        case 0: return;
//        default:
//          System.out.println("무효한 메뉴 번호입니다.");
//      }
//      System.out.println();
//    } 
//  }
//
//  static void doChallengeMenu() {
//    while (true) {
//      System.out.println();
//      System.out.println("[메인/챌린지]");
//      System.out.println("1. 이달의 챌린지");
//      System.out.println("2. 이달의 랭킹");
//      System.out.println("0. 이전메뉴");
//
//      int menuNo = Prompt.inputInt("챌린지> ");
//      switch (menuNo) {
//        case 1: challengeHandler.showChallenge(); break;
//        case 2: challengeHandler.showRanking(); break;
//        case 0: return;
//        default:
//          System.out.println("무효한 메뉴 번호입니다.");
//      }
//      System.out.println();
//    }
//
//  }
//
//  static void doDonationMenu() {
//    while (true) {
//      System.out.println();
//      System.out.println("[메인/모금함]");
//      System.out.println("1. 모금함 목록");
//      System.out.println("2. 모금함 상세보기");
//      System.out.println("3. 기부 총 금액");
//      System.out.println("4. 모금함 개설 신청");
//      System.out.println("0. 이전메뉴");
//
//      int menuNo = Prompt.inputInt("모금함> ");
//      switch (menuNo) {
//        case 1: donationBoardHandler.list(); break;
//        case 2: donationBoardHandler.detailDonation(); break;
//        case 3: donationBoardHandler.totalDonationDetail(); break;
//        case 4: donationBoardHandler.applyDonation(); break;
//        case 0: return;
//        default:
//          System.out.println("무효한 메뉴 번호입니다.");
//      }
//      System.out.println();
//    }
//  }
//
//  static void doSupportMenu() {
//    while (true) {
//      System.out.println();
//      System.out.println("[메인/고객센터]");
//      System.out.println("1. 공지사항");
//      System.out.println("2. 문의하기");
//      System.out.println("0. 이전메뉴");
//
//      int menuNo = Prompt.inputInt("고객센터> ");
//      switch (menuNo) {
//        case 1: supportHandler.showNoticeList(); break;
//        case 2: supportHandler.showQuestionList(); break;
//        case 0: return;
//        default:
//          System.out.println("무효한 메뉴 번호입니다.");
//      }
//      System.out.println();
//    }
//  }
//
//  static void doMyPageMenu() {
//    while (true) {
//      System.out.println();
//
//      System.out.println("[메인/ 마이페이지]");
//      System.out.println("1. 회원정보수정");
//      System.out.println("2. 나의 봉사");
//      System.out.println("3. 나의 작성글");
//      System.out.println("4. 나의 포인트");
//      System.out.println("5. 나의 모금함");
//      System.out.println("6. 기관 승인 신청");
//      System.out.println("7. 회원탈퇴");
//      System.out.println("0. 이전메뉴");
//
//      int menuNo = Prompt.inputInt("마이페이지> ");
//      switch (menuNo) {
//        case 1: myPageHandler.myProfile(); break;
//        case 2: myPageHandler.myVolunteer(); break;
//        case 3: myPageHandler.myBoardList(); break;
//        case 4: myPageHandler.myPoint(); break;
//        case 5: myPageHandler.myDonation(); break;
//        case 6: myPageHandler.approveOrganization(); break;
//        case 7: myPageHandler.withdrawMember(); break;
//        case 0: return;
//        default:
//          System.out.println("무효한 메뉴 번호입니다.");
//      }
//      System.out.println();
//    }
//  }
//
//  static void doAdminPageMenu() {
//    while (true) {
//      System.out.println();
//      System.out.println("[메인/관리자페이지]");
//      System.out.println("1. 회원정보조회");
//      System.out.println("2. 모금관리");
//      System.out.println("3. 봉사활동관리");
//      System.out.println("4. 공지사항관리");
//      System.out.println("5. 문의사항관리");
//      System.out.println("6. 챌린지관리");
//      System.out.println("7. 기관승인");
//      System.out.println("0. 이전메뉴");
//
//      int menuNo = Prompt.inputInt("관리자페이지> ");
//      switch (menuNo) {
//        case 1: adminPageHandler.showMember(); break;
//        case 2: adminPageHandler.showDonation(); break;
//        case 3: adminPageHandler.showVolunteer(); break;
//        case 4: adminPageHandler.showNotice(); break;
//        case 5: adminPageHandler.showQuestion(); break;
//        case 6: adminPageHandler.showChallenge(); break;
//        case 7: adminPageHandler.showOrgApprove(); break;
//        case 0: return;
//        default:
//          System.out.println("무효한 메뉴 번호입니다.");
//      }
//      System.out.println();
//    }
//  }
//
//  static int doMainMenu() {
//    System.out.println();
//    System.out.println("[행복하share에 오신것을 환영합니다.]");
//    System.out.println("1. 함께해요");
//    System.out.println("2. 소통해요");
//    System.out.println("3. 챌린지");
//    System.out.println("4. 모금함");
//    System.out.println("5. 고객센터");
//    System.out.println("6. 마이페이지");
//    System.out.println("7. 관리자페이지");
//    System.out.println("0. 종료");
//    System.out.println();
//    return Prompt.inputInt("메뉴번호> "); 
//
//  }
//
//}