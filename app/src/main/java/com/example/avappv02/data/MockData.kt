package com.example.avappv02.data

object MockData {
    val allCategories = listOf(
        Category(
            id = 1,
            name = "Account and Plan Management",
            subCategories = listOf(
                SubCategory(
                    id = 101,
                    name = "How to use the service",
                    templates = listOf(
                        Template(
                            title = "Service Overview",
                            content = """With our service, all you need to focus on is creating quality content for your followers, and we will handle the rest.
                |Here's how Ascend Viral facilitates growth for your account:
                |- We analyze profiles to find the perfect match based on the information you provide in a form. This includes your targets, hashtags, location, etc.
                |- We engage with real accounts that have a genuine interest in your content.
                |- As a result, you will gain engaged and excited new fans who will follow you back.
                |- We unfollow these users after 3-7 days, unless you choose to keep some of them by adding them to what we call "the whitelist."
                |
                |Your current following will also be added to the whitelist, ensuring that we do not interact with them. This is known as the follow/unfollow method.
                """.trimMargin()
                        ),
                        Template(
                            title = "Service Introduction Video",
                            content = """To get an idea of how our service works, please check out this video:
    |https://youtu.be/_VEJsL3XpLI
    """.trimMargin()
                        ),
                        Template(
                            title = "Follow/Unfollow Strategy",
                            content = """We employ strategies to follow and unfollow numerous accounts every month, specifically those that we believe would be interested in your content. 
    |By following them, they are more likely to visit your account and give you a follow. 
    |Our approach is conducted safely, and our personal growth assistants are highly trained experts in achieving growth. :)
    """.trimMargin()
                        ),
                        Template(
                            title = "Organic Followers Guarantee",
                            content = """By using our service, you will receive 100% organic, real, and highly targeted followers, guided by an expert growth assistant throughout the entire process.
    """.trimMargin()
                        ),
                        Template(
                            title = "Monthly Interactions",
                            content = """On your behalf, we typically interact with 3,000-4,000 accounts every month.
    """.trimMargin()
                        ),
                        Template(
                            title = "Ethical Engagement Strategy",
                            content = """Engaging in follow-unfollow spam violates Instagram's Terms of Service. However, we do not engage in spamming. 
    |Instead, we effectively interact with your community in a meaningful way to attract more visitors to your profile. 
    |Ultimately, it is your profile and content that will convince users to hit that follow button and give them a reason to stay. :)
    """.trimMargin()
                        ),
                        Template(
                            title = "Daily Actions and Billing",
                            content = """We carry out approximately 150-200 actions (follow/unfollow) every day. 
    |This number aligns with Instagram's maximum limit to avoid action blocks. 
    |As a result, we charge our clients on a monthly basis to ensure consistent growth.
    """.trimMargin()
                        ),
                        Template(
                            title = "Onboarding Process",
                            content = """Typically, the onboarding process involves 2-3 days of defining your target audience and completing the necessary steps. 
    |This is followed by 2-3 days of growth before the paid plan officially begins.
    """.trimMargin()
                        ),
                        Template(
                            title = "Growth Enhancement Metaphor",
                            content = """I often describe Ascend Viral as gasoline, where your content and targeting preferences act as the fire. 
    |We can only enhance your growth if your content and targeting are already effective.
    """.trimMargin()
                        ),
                        Template(
                            title = "Commitment-Free Service",
                            content = """We appreciate your interest in our services. 
    |I want to assure you that our services are commitment-free, and we do not require you to sign a contract. 
    |You have the freedom to cancel your subscription anytime you wish.
    """.trimMargin()
                        ),
                        Template(
                            title = "Password Requirement",
                            content = """Yes, we do require a password in order to provide our growth service. 
    |Unlike services that send fake followers, we focus on building genuine relationships through a manual follow/unfollow process.
    """.trimMargin()
                        ),
                        Template(
                            title = "Free Trial and Billing",
                            content = """We only charge you after your 5-day free trial period. 
    |You can choose to cancel during the trial period, and we won't charge you.
    """.trimMargin()
                        ),
                        Template(
                            title = "Whitelist and Unfollow Policy",
                            content = """We don't unfollow your current followings. We only unfollow those we specifically follow on your account. 
    |Your current followings will be added to a whitelist. 
    |You can always add more to that whitelist as we progress with your account growth.
    """.trimMargin()
                        ),
                        Template(
                            title = "Daily Actions",
                            content = "We typically carry out approximately 200 actions per day, which appears to be the maximum limit allowed by Instagram without triggering action blocks."
                        )
                    )
                ),
                SubCategory(
                    id = 102,
                    name = "Account set up and management",
                    templates = listOf(
                        Template(
                            title = "Onboarding and Growth Timeline",
                            content = """Typically, the onboarding process involves 2-3 days of defining your target audience and completing the necessary steps. 
    |This is followed by 2-3 days of growth before the paid plan officially begins.
    """.trimMargin()
                        ),
                        Template(
                            title = "Payment Confirmation",
                            content = """Please note that our payment processor may take up to 12 hours to confirm the payment. 
    |If you do not gain access within 12 hours, please let me know so I can assist you further.
    """.trimMargin()
                        ),
                        Template(
                            title = "Reconnect Account",
                            content = """If you need to reconnect your account, you can use the following link: 
    |https://assistant.ascendviral.com/control
    """.trimMargin()
                        ),
                        Template(
                            title = "Update Password Assistance",
                            content = """If you would like assistance in updating your password, you can do so by accessing the following link: 
    |https://assistant.ascendviral.com/control
    |Click "EDIT" under credentials, type down your correct password, then hit update!
    """.trimMargin()
                        ),
                        Template(
                            title = "Growth Strategy Form Assistance",
                            content = """If you're having trouble with filling out your growth strategy form, 
    |please make sure you type in the hashtags and enter them one by one!
    """.trimMargin()
                        ),
                        Template(
                            title = "Strategy Update Assistance",
                            content = """In case you are unable to edit and submit a new strategy, you may need to wait for your personal growth assistant to assist you with the update. 
    |Alternatively, you can send your username and password to your assistant through the messaging section, and they will make the correction on their end.
    """.trimMargin()
                        ),
                        Template(
                            title = "Updating Your Growth Strategy",
                            content = """To make the update, you can send a message to your assistant through the messaging section of our platform. 
    |They will assist you in making the necessary changes, or you can edit your growth strategy in the settings section to enter the correct information.
    """.trimMargin()
                        ),
                        Template(
                            title = "Updating Instagram Credentials",
                            content = """If you need to update your Instagram username and password, simply inform your growth assistant about the change, 
    |and they will guide you on how to update it correctly.
    """.trimMargin()
                        ),
                        Template(
                            title = "Growth Form Username Issue",
                            content = """I noticed that you've submitted the growth form multiple times. However, it seems that there is an issue with the username field in the submitted forms. 
    |Please note that an Instagram username cannot contain spaces.
    """.trimMargin()
                        ),
                        Template(
                            title = "Submitting a New Growth Form",
                            content = """To ensure accurate processing of your growth strategy, I kindly request you to fill out a new form with the correct username. 
    |You can access the form using the link below:
    |https://assistant.ascendviral.com/onboarding
    |
    |If this doesn't work, kindly access this link: https://assistant.ascendviral.com/control
    |Click "FILL" or "EDIT" under Strategy, then fill out your form. Once you're done, please scroll down and hit update. That's all!
    """.trimMargin()
                        ),
                        Template(
                            title = "Onboarding Form Requirements",
                            content = """After you sign up, we will require you to fill out a short 5-minute onboarding form. 
    |This form will include providing your Instagram credentials and sharing details about your account and target audience. 
    |We want to know who you want to target and any specific preferences you may have.
    """.trimMargin()
                        )
                    )
                ),
                SubCategory(
                    id = 103,
                    name = "Plan options and differences",
                    templates = listOf(
                        Template(
                            title = "Plans and Pricing",
                            content = """We currently offer two different plans. 
    |For more information about our plans and pricing, please visit: 
    |https://ascendviral.com/followers/
    """.trimMargin()
                        ),
                        Template(
                            title = "Turbo Plan Benefits",
                            content = """If you opt for the turbo plan, we can provide additional assistance with your content strategy and offer advice to help accelerate your account's growth. 
    |However, please note that we do not post or schedule content on your behalf.
    """.trimMargin()
                        ),
                        Template(
                            title = "Turbo Package Recommendation",
                            content = """I would recommend considering the turbo package, as our service relies on your individual follow-back ratio. 
    |The follow-back ratio improves based on the quality of your content and the targeting provided to your personal growth assistant.
    """.trimMargin()
                        ),
                        Template(
                            title = "Starter vs. Turbo Plan",
                            content = """For those who have their content strategy figured out, the Starter Growth plan should be sufficient. 
    |However, if you find yourself struggling with content creation, our Turbo Plan is the way to go. 
    |As part of this plan, we offer a detailed content report, usually available by week 3 of your subscription. 
    |This report will up your content game and enhance your strategy to drive more growth.
    """.trimMargin()
                        ),
                        Template(
                            title = "Turbo Plan Content Consultation",
                            content = """Thank you for your interest in Ascend Viral! We're excited to have you on board. 
    |As part of our Turbo plan, we can provide content consultation and give you recommendations and advice on your content strategy. 
    |However, please note that we do not offer services for posting or scheduling content on your behalf.
    """.trimMargin()
                        ),
                        Template(
                            title = "Turbo vs. Starter Plan",
                            content = """In the Turbo plan, you not only receive advice and suggestions but also have access to an Instagram expert who can address any questions or concerns you may have. 
    |It's like having a personal consultant dedicated to your Instagram growth. 
    |We go the extra mile to provide detailed support and take more actions each month to maximize your results.
    |
    |On the other hand, the Starter plan also offers basic support and guidance to help you with your Instagram growth. 
    |However, the level of customization and in-depth assistance provided in the Turbo plan sets it apart.
    """.trimMargin()
                        ),
                        Template(
                            title = "Turbo Plan Customization",
                            content = """With the Turbo plan, we provide additional customization options that go beyond what's offered in the Starter pack. 
    |We can help you tailor your bio, provide more personalized suggestions, and offer guidance that is specific to your account.
    """.trimMargin()
                        ),
                        Template(
                            title = "Turbo Plan Coaching and Support",
                            content = """The Turbo plan includes comprehensive advice and coaching. 
    |We can assist you with various aspects such as hashtags, posting strategies, and bio optimization. 
    |Our goal is to provide detailed responses to your queries within 24-48 hours, although response times may vary depending on the complexity of the request.
    """.trimMargin()
                        ),
                        Template(
                            title = "Advanced Support with Turbo Plan",
                            content = """With the Turbo plan, we offer advanced support that goes beyond the basic features. 
    |Think of us as consultants for your Instagram profile. 
    |If you need help with hashtags, posting strategies, or any other aspect, we are here to provide guidance and assistance. 
    |Please note that the Starter plan does not include this level of customization.
    """.trimMargin()
                        ),
                        Template(
                            title = "Personalized Consulting with Turbo Plan",
                            content = """Our advanced support, available with the Turbo plan, includes personalized consulting and advice from your dedicated growth assistant. 
    |We can assist you with profile optimization, growth strategies, content planning, and more. 
    |It's like having a trusted advisor for your Instagram journey.
    """.trimMargin()
                        ),
                        Template(
                            title = "Advanced Support and Free Trial",
                            content = """With our advanced support, you can expect personalized consultation and advice from your dedicated growth assistant. 
    |They will assist you with various aspects of your Instagram account, such as optimizing your bio, providing content consultation, and offering guidance on effective hashtag usage.
    |
    |In the Turbo plan, you will have access to more comprehensive advice and suggestions. 
    |It's like having an Instagram expert at your service, where you can ask anything related to Instagram and receive detailed guidance.
    |
    |While the Starter plan also includes support and guidance, the Turbo plan offers a higher level of detail and involves more actions taken on your account each month.
    |
    |To help you decide if Ascend Viral is the right fit for your Instagram growth, we offer a five-day free trial. You can cancel anytime without any long-term commitments.
    |
    |Please let me know if you have any further questions.
    """.trimMargin()
                        ),
                        Template(
                            title = "Celebrity Plan Availability",
                            content = """Due to the specialized nature of the service and the specific actions involved, our spots for the Celebrity plan are currently at capacity. 
    |However, you may consider trying our Turbo plan, which employs a manual approach to the follow/unfollow method.
    """.trimMargin()
                        )
                    )
                ),
                SubCategory(
                    id = 104,
                    name = "Free trial",
                    templates = listOf(
                        Template(
                            title = "Trial Period Overview",
                            content = """During the trial period, we take the necessary steps to connect and link your account, conduct thorough research, and create a tailored growth strategy. 
    |Additionally, we strive to maximize your trial by initiating a few days of follow actions. 
    |Please note that the trial period lasts for 5 days, and typically, we have everything set up and running smoothly by day 2 or 3 of the trial.
    """.trimMargin()
                        ),
                        Template(
                            title = "Getting Started with Ascend Viral",
                            content = """When you sign up with Ascend Viral, we kick off by doing some essential groundwork to make your Instagram growth journey a success. 
    |This initial phase typically takes about 2-3 days. During this time, we conduct in-depth research to understand your unique growth strategy, and we carefully define your target audience. 
    |This step is crucial to ensure that we start targeting the right people effectively. 
    |Once we've completed this groundwork, we'll promptly log in to your account and begin the activity that drives organic growth. 
    |Rest assured, we'll keep you updated!
    """.trimMargin()
                        ),
                        Template(
                            title = "Onboarding and Growth Timeline",
                            content = """Typically, the onboarding process and defining your target audience takes around 2-3 days. 
    |After that, the growth phase begins, which also lasts around 2-3 days before the paid plan commences.
    """.trimMargin()
                        ),
                        Template(
                            title = "Free Trial Offer",
                            content = """To help you determine if we are the right fit for your Instagram growth, we offer a five-day free trial. 
    |You can cancel anytime, and there are no long-term commitments.
    """.trimMargin()
                        ),
                        Template(
                            title = "Trial Recommendation",
                            content = """Hi there! Unfortunately, whether you opt for a trial or purchase the plan outright, we still need to gather your information and warm up your account. 
    |Therefore, I would recommend staying on the trial.
    """.trimMargin()
                        ),
                        Template(
                            title = "Five-Day Free Trial",
                            content = """To give our service a try and see if it aligns with your Instagram growth goals, you can take advantage of our five-day free trial. 
    |This trial allows you to experience our service firsthand and make an informed decision. 
    |The best part is, you can cancel anytime without any long-term commitments.
    """.trimMargin()
                        ),
                        Template(
                            title = "What to Expect During the Free Trial",
                            content = """During the free trial period, our primary goal is to get you acquainted with the Ascend Viral experience and set the foundation for a successful Instagram growth journey. 
    |Here's what you can expect during the trial:
    |
    |1. Account connection and linking: We will connect your account with your Personal Growth Assistant and ensure everything is set up correctly for a smooth start.
    |2. Research and growth strategy creation: Our team will analyze your account and create a personalized growth strategy based on your target audience, content, and goals.
    |3. Initial follow actions: We typically perform a couple of days of follow actions during the trial period.
    |
    |The trial period is designed to help you become familiar with our service and processes, without spending money during the initial setup and low-activity phase. 
    |This ensures that once you transition to a paid plan, you'll be in an excellent position to maximize your growth potential with Ascend Viral.
    """.trimMargin()
                        ),
                        Template(
                            title = "Purpose of the Trial Period",
                            content = """The trial period is primarily aimed at getting you started and registered with us, rather than providing significant follower growth right away. 
    |During the trial period, there is usually limited activity, which is why we offer it at no cost to ensure you don't spend money during this initial phase.
    """.trimMargin()
                        ),
                        Template(
                            title = "Free Trial Availability",
                            content = """The free trial is available on all of our plans. 
    |All you have to do is sign up.
    """.trimMargin()
                        ),
                        Template(
                            title = "Starting Your Free Trial",
                            content = """To start your trial, simply choose one of the plans here, and continue with the sign-up process: 
    |https://ascendviral.com/followers/
    """.trimMargin()
                        ),
                        Template(
                            title = "Subscription Processing Time",
                            content = """Please note that the system may take up to 12 hours to process subscriptions. 
    |If you do not gain access after this period, feel free to reach out to us via live chat, and we'll assist you promptly.
    """.trimMargin()
                        )
                    )
                ),
                SubCategory(
                    id = 105,
                    name = "Billing and pricing",
                    templates = listOf(
                        Template(
                            title = "Plans and Pricing Information",
                            content = """We currently offer two different plans. 
    |For more information about our plans and pricing, please visit: 
    |https://ascendviral.com/followers/
    """.trimMargin()
                        ),
                        Template(
                            title = "Payment Methods",
                            content = """Currently, we do not accept cryptocurrency payments. 
    |We only accept payments through the available payment methods on our platform (PayPal & Credit Card).
    """.trimMargin()
                        ),
                        Template(
                            title = "PayPal Payment Requirements",
                            content = """Please note that PayPal requires linked credit cards or bank accounts with sufficient funds for recurring payments. 
    |If you encounter any issues with your PayPal payment, please ensure your payment method is properly linked and has enough funds to cover the recurring charges.
    """.trimMargin()
                        ),
                        Template(
                            title = "Payment Processing and Resolution",
                            content = """Our system automatically attempts to process payments and will make another attempt within the next 24 hours if there is an issue with your payment. 
    |
    |If you want to process it faster, first cancel your subscription here: 
    |https://ascendviral.com/members-area/
    |
    |Then, you can purchase a new subscription here (you'll have to pay with Stripe): 
    |https://ascendviral.com/start-instantly/
    """.trimMargin()
                        ),
                        Template(
                            title = "Plan Benefits and Ebook Option",
                            content = """The plan can save you 80+ hours per month, which is a significant time-saving benefit. 
    |I personally believe that alone makes it well worth the investment. 
    |However, if you feel that it may not be the optimal choice for you at the moment, I recommend considering our ebook. 
    |In the ebook, we explain the whole process in detail, providing valuable insights and knowledge. 
    |It can be a great resource to help you navigate Instagram growth effectively.
    """.trimMargin()
                        )
                    )
                ),
                SubCategory(
                    id = 106,
                    name = "New Instagram account / Content",
                    templates = listOf(
                        Template(
                            title = "Pre-Service Posting Recommendation",
                            content = """Before joining our service, we highly recommend taking 4-6 weeks of consistent posting to build momentum. 
    |Having engaging content is crucial to attract and retain followers, and this initial period of regular posting will significantly enhance your organic growth potential.
    """.trimMargin()
                        ),
                        Template(
                            title = "Content Requirement for Growth",
                            content = """We recommend having existing content on your account (at least 9 posts) before using our service. 
    |This way, people will have a reason to follow you and engage with your account, leading to better growth results.
    """.trimMargin()
                        ),
                        Template(
                            title = "Advice for Newly Created Accounts",
                            content = """Newly created accounts are less trusted by Instagram. Thus, they usually don't go past the warm-up phase. 
    |With this in mind, we strongly encourage you to take 4-6 weeks to start posting content. 
    |Growing an account with limited or no posts organically can be very difficult. 
    |Posting high-quality content will help attract and retain followers, resulting in better growth outcomes.
    """.trimMargin()
                        ),
                        Template(
                            title = "Minimum Content Requirement",
                            content = """We require at least 9 posts before we can start working on your account. 
    |This helps ensure that there is enough content to attract and engage your target audience effectively.
    """.trimMargin()
                        ),
                        Template(
                            title = "Account Setup Recommendations",
                            content = """As a general recommendation, we suggest starting with 9 high-quality posts. 
    |Along with that, having a well-crafted bio and a good profile picture can also positively impact your growth. 
    |It's important to note that new accounts may take longer to achieve significant growth results.
    """.trimMargin()
                        ),
                        Template(
                            title = "Growth Support for Art Accounts",
                            content = """We can certainly help you grow your art account. 
    |Our services cover various niches, and as long as your target audience exists on Instagram, we can assist in attracting an artistic audience specifically tailored to your content. 
    |Our personal growth assistants will guide you throughout the process and continuously optimize your profile and strategy to deliver the best possible results.
    """.trimMargin()
                        ),
                        Template(
                            title = "Importance of Consistent Content",
                            content = """Consistent content is key to achieving the best results. 
    |Our strategy can work effectively on a new account, but it relies on regular posting of high-quality content. 
    |I recommend aiming for at least one post, reel, or story per day or every other day to keep your account active and engage your audience.
    """.trimMargin()
                        )
                    )
                ),
                SubCategory(
                    id = 107,
                    name = "Upgrade/Downgrade",
                    templates = listOf(
                        Template(
                            title = "Changing Subscription Plans",
                            content = """The easiest way to do this is to wait until your current subscription ends, cancel your current subscription, and then sign up with a new subscription under your preferred plan. 
    |If this isn’t an ideal solution, then you can contact your Personal Growth Assistant regarding this.
    """.trimMargin()
                        ),
                        Template(
                            title = "Changing Subscription Plan via PayPal",
                            content = """If you signed up using PayPal, here's how you can change your subscription plan:
    |
    |1. Cancel your current subscription using this link: https://ascendviral.com/members-area/
    |
    |2. Wait until your subscription expiry date, and then purchase your preferred plan using this link: https://ascendviral.com/start-instantly/
    |
    |Make sure you're logged in to your Ascend Viral account!
    """.trimMargin()
                        ),
                        Template(
                            title = "Changing Subscription Plan via Stripe",
                            content = """If you signed up with Stripe, simply inform us of the plan you’d like to proceed with and share the email address associated with your account. 
    |We’ll promptly forward your request to the relevant team, and you can expect an email from us as soon as it’s processed!
    """.trimMargin()
                        )
                    )
                ),
                SubCategory(
                    id = 108,
                    name = "Add multiple subscriptions or new subscription",
                    templates = listOf(
                        Template(
                            title = "Starting a New Subscription",
                            content = """To start a new subscription, please follow the link below: 
    |https://ascendviral.com/start-instantly/
    |
    |Kindly note that new subscriptions won't be eligible for a free trial since the trial offer is available once per account.
    """.trimMargin()
                        ),
                        Template(
                            title = "Managing Multiple Accounts",
                            content = """Absolutely! You can add as many accounts as you wish, and all of them can be managed from one Instagram dashboard.
    |
    |Let me know if you ever plan on adding more accounts, and I'll gladly help.
    """.trimMargin()
                        ),
                        Template(
                            title = "Adding Additional Accounts",
                            content = """To add more accounts for growth, simply follow this guide:
    |
    |1. Purchase a new subscription for your account here: https://ascendviral.com/start-instantly/
    |
    |2. Onboard your new account and fill out a growth strategy for it here: https://assistant.ascendviral.com/onboarding
    |
    |Make sure to let your assistant know about your second account!
    """.trimMargin()
                        ),
                        Template(
                            title = "Swapping Your Account",
                            content = """To swap your account, please fill out another growth strategy form using the following link: 
    |http://dashboard.ascendviral.com/onboarding. 
    |Once we receive your new form, we will proceed with updating your account information.
    |
    |Make sure to let your growth assistant know!
    """.trimMargin()
                        ),
                        Template(
                            title = "Adding Multiple Accounts",
                            content = """Feel free to add as many accounts as you need, with a separate growth strategy for each one. 
    |Please make sure to pay for each subscription separately, but rest assured that all accounts will be managed under your main account.
    """.trimMargin()
                        ),
                        Template(
                            title = "Discount for Multiple Accounts",
                            content = """You have the flexibility to add as many accounts as you want. 
    |If you're planning to add multiple accounts, you can use the coupon code "coupon-example" to receive a $20 discount on each additional account subscribed to the Turbo plan. 
    |This coupon code is usually reserved for clients with multiple accounts.
    """.trimMargin()
                        )
                    )
                ),
            )
        ),
        Category(
            id = 2,
            name = "Growth strategy and performance",
            subCategories = listOf(
                SubCategory(
                    id = 201,
                    name = "Growth delay and what's next",
                    templates = listOf(
                        Template(
                            title = "Onboarding and Growth Timeline",
                            content = """Typically, the onboarding process involves 2-3 days of defining your target audience and completing the necessary steps. 
    |This is followed by 2-3 days of growth before the paid plan officially begins.
    """.trimMargin()
                        ),
                        Template(
                            title = "Growth Assistant Unavailable",
                            content = """I apologize, but it seems that your current growth assistant is not available online at the moment. 
    |I've left a note for them, and they'll get back to you as soon as possible!
    """.trimMargin()
                        ),
                        Template(
                            title = "Target Audience Review & Next Steps",
                            content = """Perfect! Your personal growth assistant will review all the information you submitted, 
    |define the correct target audience within 48-72 hours, and get started with the process as soon as possible. 
    |Feel free to text them in the meantime!
    """.trimMargin()
                        ),
                        Template(
                            title = "Account Activation Notification",
                            content = """I notify your growth assistant to begin working on your account as soon as possible.
    """.trimMargin()
                        ),
                        Template(
                            title = "Dashboard Account Processing Time",
                            content = """Sometimes it may take up to 48 hours for accounts to appear in the dashboard, 
    |especially during weekends when the processing time may be longer. 
    |Once your account shows up in the dashboard, your growth assistant will reach out to you through our messaging platform at:
    |https://assistant.ascendviral.com/messages
    """.trimMargin()
                        ),
                        Template(
                            title = "Unfollow Week & Growth Strategy",
                            content = """I want to assure you that your account is active and we are actively working on your growth strategy. 
    |However, please note that we are currently in the unfollow week, where we perform more unfollow actions. 
    |This may be why you are noticing fewer daily activities. We switch between follow and unfollow every week to maintain a balanced approach.
    |
    |For more details on your account's progress, I recommend reaching out to your growth manager through the messages section at:
    |https://assistant.ascendviral.com/messages
    """.trimMargin()
                        ),
                        Template(
                            title = "Account Appearance in Dashboard",
                            content = """Sometimes it may take up to 48 hours for accounts to appear in the dashboard, 
    |especially during weekends when the processing time may be longer. 
    |Once your account shows up in the dashboard, your growth assistant will reach out to you through our messaging platform at:
    |https://assistant.ascendviral.com/messages
    """.trimMargin()
                        )
                    )
                ),
                SubCategory(
                    id = 202,
                    name = "Estimation and guarantee of growth",
                    templates = listOf(
                        Template(
                            title = "Monthly Follower Growth Estimate",
                            content = """The number of followers you can gain per month varies based on external factors like your niche, content quality & consistency, 
    |audience engagement, and your account's general appeal. 
    |On average, growth can range from 200 to 800 followers per month, but results may differ for each account.
    |
    |We've managed accounts that have achieved substantial growth of over 2,000 followers monthly, 
    |while others have seen more modest gains of around 200 followers per month, all depending on the factors mentioned above.
    """.trimMargin()
                        ),
                        Template(
                            title = "Growth Based on Content Commitment",
                            content = """The growth you achieve with our service depends on your level of commitment and improvement in content. 
    |Some clients who are highly focused on content see significant growth of around 1,000 followers per month, 
    |while others who struggle with content may gain only a couple hundred followers per month or less.
    """.trimMargin()
                        ),
                        Template(
                            title = "Follow-Back Rate & Growth Potential",
                            content = """In my view, a "decent" account typically achieves a follow-back rate of 25-50%. 
    |This results in an average growth rate of around 400-1,200 followers. 
    |However, proactive actions such as creating better content, engaging with the community, 
    |and posting frequently can contribute to even better results.
    """.trimMargin()
                        ),
                        Template(
                            title = "Growth Guarantee & Refund Policy",
                            content = """It's quite impossible for us to guarantee growth on Instagram. 
    |If we could guarantee X amount of followers, then that should be your indicator that our service isn't organic. 
    |Since our service is organic, the only guarantee we offer is our refund policy, 
    |which is usually only offered for extremely low performers.
    |
    |For more details, visit: https://ascendviral.com/help-center/real-growth-guarantee/
    """.trimMargin()
                        ),
                        Template(
                            title = "Measuring Growth Effectiveness",
                            content = """To measure the effectiveness of our strategies on your account, 
    |please feel free to read our growth guarantee here: 
    |https://ascendviral.com/help-center/real-growth-guarantee/
    """.trimMargin()
                        ),
                        Template(
                            title = "Growth Variability",
                            content = """It is difficult to provide precise measurements as every account is unique and has different needs. 
    |We have accounts that experience growth rates of 2,000+ followers per month, while others may have significantly lower growth rates of around 200 followers. 
    |The growth depends on various factors such as content quality, targeting, and niche.
    """.trimMargin()
                        ),
                        Template(
                            title = "Factors Affecting Growth",
                            content = """Some accounts may exceed 1,500 followers (we have accounts growing by 2,000+ followers) 
    |due to factors like posting reels and maintaining a high content frequency. 
    |On the other hand, some accounts may experience negative growth if they previously purchased fake followers, 
    |which were subsequently removed by Instagram.
    """.trimMargin()
                        ),
                        Template(
                            title = "Expected Growth in the First Month",
                            content = """In the first month, you can expect to gain between 200-400 followers under optimal growth conditions. 
    |As we continually optimize growth on a weekly basis, this number improves, 
    |allowing you to achieve your monthly follower goals and potentially exceed them.
    """.trimMargin()
                        ),
                        Template(
                            title = "Growth Estimation Disclaimer",
                            content = """The estimation provided on our pricing page is a rough range, 
    |and all the followers gained through Ascend Viral are real and engaging. 
    |However, we cannot guarantee specific results as it depends on several factors.
    """.trimMargin()
                        ),
                        Template(
                            title = "Growth Guarantee & Estimations",
                            content = """We do not offer specific guarantees for the number of followers. 
    |Our estimations are based on expected results with optimized content and target settings.
    |
    |However, we have a growth guarantee that you can find here: 
    |https://ascendviral.com/help-center/real-growth-guarantee/
    """.trimMargin()
                        ),
                        Template(
                            title = "Growth Estimation Challenges",
                            content = """Providing an estimation is challenging because if there are fake followers in your account, 
    |it can take time to address and fix that issue. 
    |We have the capability to fix it, but it requires time and effort.
    """.trimMargin()
                        )
                    )
                ),
                SubCategory(
                    id = 203,
                    name = "Warm-up period",
                    templates = listOf(
                        Template(
                            title = "Warm-Up Cycle Process",
                            content = """All accounts we onboard go through a thorough warm-up cycle, 
    |which involves gradually increasing the daily activity.
    """.trimMargin()
                        ),
                        Template(
                            title = "Warm-Up Period Explained",
                            content = """The warm-up period is a gradual process where our growth assistants begin increasing activity on your account 
    |to safely remove Instagram's default activity limits. 
    |This ensures your account’s safety by avoiding sudden spikes in engagement, which could trigger Instagram’s security systems. 
    |It typically lasts for two weeks.
    """.trimMargin()
                        ),
                        Template(
                            title = "Warm-Up Phase Duration",
                            content = """The duration of the warm-up phase can vary depending on the account. 
    |Typically, it lasts for about two weeks. 
    |During this period, your growth assistant will gradually increase the daily actions 
    |to improve your account's trust score and expand the action limits.
    """.trimMargin()
                        ),
                        Template(
                            title = "Account Safety & Warm-Up Process",
                            content = """Rest assured that we prioritize the safety and well-being of your account. 
    |We warm up your account before implementing any strategies to minimize any potential issues.
    """.trimMargin()
                        ),
                        Template(
                            title = "Warm-Up Process Benefits",
                            content = """The warm-up process is designed to improve your account's trust score in the long term. 
    |It is effective for both new and established accounts.
    """.trimMargin()
                        )
                    )
                ),
                SubCategory(
                    id = 204,
                    name = "Low growth or low engagement",
                    templates = listOf(
                        Template(
                            title = "Addressing Slow Growth Concerns",
                            content = """We understand your concern about slow growth, and we'd like to help.
    |
    |It's important to note that individual results may vary depending on the quality of your content. 
    |As our service is entirely organic, it may take some time to grow. 
    |However, we're here to assist you in optimizing your growth for better results.
    |
    |To address this issue, we recommend discussing your specific situation with your personal growth assistant here: 
    |https://assistant.ascendviral.com/messages
    |
    |Your growth assistant is the best resource for personalized assistance and growth optimization.
    """.trimMargin()
                        ),
                        Template(
                            title = "Consulting Growth Assistant for Updates",
                            content = """Hi there, I don't have your specific information at the moment, 
    |so I can't provide a detailed comment on why your growth is at its current point. 
    |However, I can reach out to your growth assistant and discuss this matter further. 
    |
    |Would it be alright if I send you an email with more information after I consult with them?
    """.trimMargin()
                        ),
                        Template(
                            title = "Addressing Engagement Issues",
                            content = """You mentioned that you're experiencing issues with the engagement on your account. 
    |To address this matter, I recommend discussing it with your growth assistant. 
    |They are well-equipped to provide you with a detailed consultation and guidance on improving your engagement.
    |
    |You can conveniently reach out to your growth assistant by visiting this link: 
    |https://assistant.ascendviral.com/messages
    """.trimMargin()
                        ),
                        Template(
                            title = "Impact of Fake Followers on Growth",
                            content = """In some cases, individuals may not experience the anticipated growth with our service due to previous activity on their account, 
    |such as buying fake followers. Instagram often removes these fake followers, which can lead to a decrease in the overall follower count. 
    |However, we can still help you gain real, engaging followers during that period, even if the net result may appear as a slight decrease.
    """.trimMargin()
                        ),
                        Template(
                            title = "Temporary Activity Adjustment",
                            content = """It seems that we briefly lowered activity in order to keep your account healthy. 
    |Sometimes, we see indicators early on that tell us to take a break and go a bit slower in order to reach max performance later.
    |
    |I'll take a look at your account and see what I can find. 
    |I'll also reach out to your personal growth assistant so they can follow up with you.
    """.trimMargin()
                        )
                    )
                ),
                SubCategory(
                    id = 205,
                    name = "Follower retention",
                    templates = listOf(
                        Template(
                            title = "Retention Rate Factors",
                            content = """Retention rates primarily depend on the quality of your content and how well you engage with your audience. 
    |Ascend Viral serves as a catalyst, while your content serves as the driving force for long-term engagement and follower retention.
    """.trimMargin()
                        ),
                        Template(
                            title = "Retaining Your Followers",
                            content = """The followers we gain for your account are real, genuine users. 
    |The best way to retain them is by consistently posting high-quality content and actively engaging with your audience. 
    |Respond to comments, interact with their posts, and maintain a regular posting schedule—this helps build a strong connection 
    |and keeps your followers interested in your content long-term.
    """.trimMargin()
                        ),
                        Template(
                            title = "Preventing Unfollows",
                            content = """If you consistently post compelling content and actively engage with your audience through comments, 
    |direct messages, and stories, there's no reason for people to unfollow you.
    """.trimMargin()
                        ),
                        Template(
                            title = "Follower Retention with Ascend Viral",
                            content = """Unlike growth methods such as giveaways or buying followers, Ascend Viral excels in follower retention. 
    |Our methods focus on gaining real and active followers who genuinely like your content, 
    |leading to better long-term engagement and retention.
    """.trimMargin()
                        ),
                        Template(
                            title = "Real Followers Guarantee",
                            content = """With Ascend Viral, all the followers you gain are real people.
    """.trimMargin()
                        ),
                        Template(
                            title = "Factors Affecting Follower Retention",
                            content = """Follower retention depends on the quality of your content and your engagement with your audience.
    """.trimMargin()
                        )

                    )
                ),
                SubCategory(
                    id = 206,
                    name = "Targeting & niche",
                    templates = listOf(
                        Template(
                            title = "Targeting Similar Accounts",
                            content = """Absolutely! We can target accounts that are most similar to yours or larger accounts 
    |whose followers would likely enjoy your content. 
    |This helps us connect with an audience that is already interested in your niche.
    """.trimMargin()
                        ),
                        Template(
                            title = "Compatibility with Niches",
                            content = """Our service is designed to work with almost all niches and accounts. 
    |As long as your target audience is on Instagram, we can assist you in growing your account.
    """.trimMargin()
                        ),
                        Template(
                            title = "Targeting English-Speaking Users & Locations",
                            content = """We can target English-speaking users and optimize your targeting based on location as well. 
    |This allows us to narrow down the audience to those who are most likely to be interested in your content.
    """.trimMargin()
                        ),
                        Template(
                            title = "Adjusting Targeting Preferences",
                            content = """Rest assured, we can absolutely adjust our targeting to better suit your preferences. 
    |All you have to do is provide us with feedback and examples of accounts we followed that don’t align with your goals. 
    |Your assistant will promptly start optimizing the targeting to ensure we’re reaching the right audience for your account.
    """.trimMargin()
                        ),
                        Template(
                            title = "Ascend Viral Growth Metaphor",
                            content = """I often describe Ascend Viral as gasoline, where your content and targeting preferences act as the fire. 
    |We can only enhance your growth if your content and targeting are already effective.
    """.trimMargin()
                        ),
                        Template(
                            title = "Target Audience Follower Range",
                            content = """The range of followers we can target typically falls between 5,000 to 200,000 followers. 
    |This range allows for effective engagement and interaction with a substantial and engaged audience.
    """.trimMargin()
                        ),
                        Template(
                            title = "Competitor & Hashtag Targeting",
                            content = """Certainly, we can target your competitors' followers as well as followers of specific hashtags. 
    |We can also customize targeting based on location and various other factors to ensure that we connect with the right audience for your account.
    """.trimMargin()
                        ),
                        Template(
                            title = "Country-Specific Targeting",
                            content = """Yes, we can certainly target an audience from a specific country. 
    |We work with numerous accounts that target Spanish-speaking audiences (and other languages), 
    |so we have experience in helping you reach your desired audience.
    """.trimMargin()
                        ),
                        Template(
                            title = "Growing Accounts in Foreign Languages",
                            content = """We are pleased to inform you that we can indeed help grow accounts in foreign languages. 
    |Our services are not limited to any specific language, and we can target your desired audience regardless of the language they speak.
    |
    |Our personal growth assistants are experienced in optimizing profiles and strategies for accounts in various languages. 
    |They will guide you through the process and ensure that you achieve the best results.
    """.trimMargin()
                        ),
                        Template(
                            title = "Targeting for Non-English Accounts",
                            content = """Yes, we work with non-English accounts as well. 
    |We can target users based on geolocation, hashtags, or specific accounts. 
    |If you can provide us with a list of your competitors or accounts similar to yours, we can target their audience effectively.
    """.trimMargin()
                        ),
                        Template(
                            title = "Supporting Artists on Instagram",
                            content = """Our service is designed to work for a wide range of niches and accounts, including artists. 
    |We have successfully worked with many artists from around the world to help them grow their Instagram presence.
    """.trimMargin()
                        ),
                        Template(
                            title = "Competitor-Based Targeting",
                            content = """If you have competitor accounts in mind that are similar to yours, 
    |our service is likely to work well for you.
    """.trimMargin()
                        )
                    )
                ),
                SubCategory(
                    id = 207,
                    name = "Wrong targeting",
                    templates = listOf(
                        Template(
                            title = "Targeting Accuracy & Limitations",
                            content = """At Ascend Viral, we have developed one of the best targeting practices in our industry. 
    |However, it's important to note that our filters are not 100% perfect, and there is a margin for error.
    |
    |We strive to effectively filter out approximately 85% of the wrong users, 
    |but there may still be instances where some incorrect accounts slip through the cracks. 
    |Additionally, given the high prevalence of fake and bot accounts on Instagram, 
    |it becomes challenging to ensure a completely error-free targeting process.
    """.trimMargin()
                        ),
                        Template(
                            title = "Targeting Limitations & Refinement",
                            content = """Please note that targeting is an evolving process, and achieving perfect accuracy can be difficult. 
    |Instagram doesn't share sensitive details like users' location, age, or gender, 
    |and many users don't include this information in their profiles. 
    |However, we're always refining our techniques to enhance your targeting for the best possible results.
    """.trimMargin()
                        ),
                        Template(
                            title = "Challenges with Private Account Targeting",
                            content = """In some cases, we may follow a private account that appears normal from the outside, 
    |but upon acceptance, it becomes evident that the account is not as appropriate or targeted as we initially thought. 
    |We acknowledge this issue and are committed to improving our targeting methods.
    """.trimMargin()
                        ),
                        Template(
                            title = "Ghost Followers Limitation",
                            content = """Unfortunately, ghost followers are something beyond our control. 
    |Occasionally, users may follow your account who are bots or become inactive over time.
    """.trimMargin()
                        )
                    )
                ),
                SubCategory(
                    id = 208,
                    name = "Hashtags",
                    templates = listOf(
                        Template(
                            title = "Hashtag Strategy for Best Results",
                            content = """For the hashtags, you can follow the strategy below to get the best results possible:
    |
    |1. Use 2-3 hashtags where the average post likes are lower than your average (easier to rank).
    |2. Use 2-3 hashtags where the average post likes are the same as your average (medium difficulty to rank).
    |3. Use 2-3 hashtags where the average post likes are a little higher than your average (harder to rank but will bring more traffic).
    """.trimMargin()
                        )
                    )
                ),
                SubCategory(
                    id = 209,
                    name = "Growth strategy",
                    templates = listOf(
                        Template(
                            title = "Onboarding Process Overview",
                            content = """Once you sign up, you'll be asked to complete a brief onboarding form that takes about 5 minutes. 
    |In this form, you'll need to provide your Instagram login details and share information about your account and target audience. 
    |This helps us understand who you'd like to target and any specific preferences you might have.
    """.trimMargin()
                        ),
                        Template(
                            title = "Supporting Artists on Instagram",
                            content = """Our service is designed to work for a wide range of niches and accounts, including artists. 
    |We have successfully worked with many artists from around the world to help them grow their Instagram presence.
    """.trimMargin()
                        ),
                        Template(
                            title = "Specifying Target Locations",
                            content = """When you fill out your growth strategy, please make sure to include the specific locations 
    |you want us to target in the "locations" field. It can be a city, state, or even an entire country. 
    |We will then focus on finding and engaging with the audience from your preferred location.
    """.trimMargin()
                        ),
                        Template(
                            title = "Ascend Viral Growth Metaphor",
                            content = """I often describe Ascend Viral as gasoline, where your content and targeting preferences act as the fire. 
    |We can only enhance your growth if your content and targeting are already effective.
    """.trimMargin()
                        ),
                        Template(
                            title = "Updating Your Growth Strategy",
                            content = """To make the update, you can send a message to your assistant through the messaging section of our platform. 
    |They will assist you in making the necessary changes, or you can edit your growth strategy in the settings section to enter the correct information.
    """.trimMargin()
                        ),
                        Template(
                            title = "Filling Out a New Growth Strategy Form",
                            content = """To fill out a new growth strategy form, please visit:
    |
    |https://assistant.ascendviral.com/onboarding
    """.trimMargin()
                        )
                    )
                ),
                SubCategory(
                    id = 210,
                    name = "Other growth methods / fake followers",
                    templates = listOf(
                        Template(
                            title = "Ascend Viral vs. Other Growth Methods",
                            content = """Unlike growth methods such as giveaways or buying followers, Ascend Viral excels in follower retention. 
    |Our methods focus on gaining real and active followers who genuinely like your content, 
    |leading to better long-term engagement and retention.
    """.trimMargin()
                        ),
                        Template(
                            title = "Effectiveness of Follow Actions",
                            content = """The follow actions we perform offer better return on investments (ROIs) 
    |and are highly effective when targeted towards the right audience for your account. 
    |This can help generate meaningful traffic, momentum, and sales.
    """.trimMargin()
                        ),
                        Template(
                            title = "Impact of Fake Followers on Growth",
                            content = """In some cases, individuals may not experience the anticipated growth with our service 
    |due to previous activity on their account, such as buying fake followers. 
    |Instagram often removes these fake followers, which can lead to a decrease in the overall follower count. 
    |However, we can still help you gain real, engaging followers during that period, 
    |even if the net result may appear as a slight decrease.
    """.trimMargin()
                        ),
                        Template(
                            title = "Why Mass Likes Are Not Recommended",
                            content = """Mass likes is generally not a good strategy for several reasons, 
    |including the risk of attracting bot followers and low-quality giveaway followers.
    """.trimMargin()
                        ),
                        Template(
                            title = "Avoid Using Multiple Growth Services",
                            content = """It's important to note that using multiple growth services simultaneously can lead to account closure, 
    |so it's recommended to stick with one service at a time.
    """.trimMargin()
                        ),
                        Template(
                            title = "Maximizing Account Growth Capacity",
                            content = """We make use of the maximum capacity of your account, running your growth from a dedicated device. 
    |Our growth experts push your account to its limits in terms of interactions to achieve the best results.
    """.trimMargin()
                        ),
                        Template(
                            title = "Avoiding Automation with Our Service",
                            content = """It is generally not recommended to use any kind of automation in conjunction with our service. 
    |Previous automation practices, such as auto-liking, can potentially hinder your results 
    |due to increased restrictions from Instagram.
    """.trimMargin()
                        ),
                        Template(
                            title = "Avoid Bulk Deleting Followers",
                            content = """Deleting a large number of followers in bulk is not recommended as it can be seen as suspicious by Instagram 
    |and may result in actions against your account. 
    |We advise against deleting more than 30-50 followers per day to avoid potential consequences.
    """.trimMargin()
                        ),
                        Template(
                            title = "Instagram's Bot Removal Process",
                            content = """The good news is that Instagram takes regular actions to remove bots from the platform. 
    |Over time, these ghost followers will likely be identified and removed from your account by Instagram's automated systems.
    """.trimMargin()
                        )
                    )
                )
            )
        ),
        Category(
            id = 3,
            name = "Content creation and strategy",
            subCategories = listOf(
                SubCategory(
                    id = 301,
                    name = "Creating posts and content",
                    templates = listOf(
                        Template(
                            title = "Turbo Plan Content Assistance",
                            content = """If you opt for the turbo plan, we can provide additional assistance with your content strategy 
    |and offer advice to help accelerate your account's growth. 
    |However, please note that we do not post or schedule content on your behalf.
    """.trimMargin()
                        ),
                        Template(
                            title = "Content Strategy Assistance",
                            content = """Yes, we can provide recommendations and advice, but we do not post or schedule content for you.
    """.trimMargin()
                        ),
                        Template(
                            title = "Importance of Consistent Content",
                            content = """Regarding content, I want to emphasize the importance of consistency. 
    |Regularly posting high-quality content is crucial to achieving desirable results.
    """.trimMargin()
                        ),
                        Template(
                            title = "Initial Content Requirements",
                            content = """To begin our service, we require a minimum of **9 high-quality posts** on your profile. 
    |Along with this, having a well-crafted bio and a good profile picture is essential to maximize your growth potential. 
    |Please note that newer accounts may take longer to achieve noticeable growth results, but meeting these requirements ensures the best possible start.
    """.trimMargin()
                        ),
                        Template(
                            title = "Overcoming Content Creation Challenges",
                            content = """What specifically are you finding challenging when it comes to content creation?
    |
    |1. Difficulty generating ideas
    |2. Insufficient engagement on your posts
    |3. Uncertainty about which captions and hashtags to use
    |4. Limited time available for content creation
    |
    |If you're facing any of these challenges, our Turbo plan can be beneficial for you. 
    |We can provide guidance on finding compelling content ideas, help you decide between multiple ideas, 
    |offer strategies to increase engagement, and assist with crafting captivating captions and selecting relevant hashtags. 
    |However, it's important to note that you will still be responsible for actually creating the content yourself.
    """.trimMargin()
                        ),
                        Template(
                            title = "Content Responsibility & Turbo Plan Benefits",
                            content = """You will still be responsible for creating and posting high-quality content. 
    |With the Turbo plan, we can also assist you with your content strategy 
    |and provide additional advice to help accelerate your account growth.
    """.trimMargin()
                        ),
                        Template(
                            title = "Outsourcing Content Creation",
                            content = """There are other services available, such as Fiverr, that can assist with creating posts 
    |while you utilize Ascend Viral for growth. 
    |Some of our customers opt for this approach, so it could be a possibility for you as well.
    """.trimMargin()
                        ),
                        Template(
                            title = "Why Choose the Turbo Package",
                            content = """I suggest opting for the Turbo package, as our service depends on your personal follow-back ratio. 
    |This ratio improves with high-quality content and precise targeting, which your dedicated growth assistant will handle for you.
    """.trimMargin()
                        ),
                        Template(
                            title = "Recommended Posting Frequency",
                            content = """We recommend posting a minimum of three times a week to maintain an active presence on Instagram.
    """.trimMargin()
                        ),
                        Template(
                            title = "Posting Frequency & Content Relevance",
                            content = """As long as the content aligns with your brand, is relevant to your niche, 
    |and generates decent engagement, you should post it as often as possible.
    """.trimMargin()
                        ),
                        Template(
                            title = "What is a Viral Reel?",
                            content = """A viral reel refers to any content that significantly expands your reach beyond your current audience. 
    |For example, if you have 1,000 followers and a reel that receives 5,000 views and 500 likes, it can be considered "viral." 
    |While it may not make you instantly famous, it signifies that people who typically do not see or engage with your content are now doing so.
    """.trimMargin()
                        )
                    )
                ),
                SubCategory(
                    id = 302,
                    name = "Using hashtags and other tactics to improve growth. (Likes or comments)",
                    templates = listOf(
                        Template(
                            title = "Effectiveness of Follow Actions",
                            content = """The follow actions we perform offer better return on investments (ROIs) 
    |and are highly effective when targeted towards the right audience for your account. 
    |This can help generate meaningful traffic, momentum, and sales.
    """.trimMargin()
                        ),
                        Template(
                            title = "Why We Focus on Follow Actions",
                            content = """No, we do not perform any likes or comments on your behalf. 
    |This is because these actions do not provide a good return on investment (ROI) 
    |and are often prone to frequent action blocks. Additionally, comments need to be highly personalized in order to be effective.
    |
    |Instead, our main focus is on follow actions, which have better ROI and are highly effective 
    |when targeted towards the right audience for your account. 
    |By engaging with the right audience through follows, we can help you generate meaningful traffic, momentum, and potential sales.
    """.trimMargin()
                        ),
                        Template(
                            title = "Hashtag Strategy for Optimal Growth",
                            content = """Hashtags play a significant role. Conduct thorough hashtag research and identify smaller hashtags that align with your content. 
    |Analyze popular posts within those hashtags, considering factors such as likes, comments, and content type. 
    |Aim to use a mix of hashtags:
    |
    |- 10 hashtags with an average post likes smaller than your average (easier to rank)
    |- 10 hashtags with an average post likes similar to your average (medium difficulty to rank)
    |- 10 hashtags with an average post likes slightly higher than your average (challenging to rank but will bring more traffic)
    |
    |Mix and match your hashtags for each post and track when you make it to the top posts to reuse those hashtags in the future.
    """.trimMargin()
                        )
                    )
                )
            )
        ),

        Category(
            id = 4,
            name = "Customer support and communication",
            subCategories = listOf(
                SubCategory(
                    id = 401,
                    name = "Thanking customers",
                    templates = listOf(
                        Template(
                            title = "Thank You for Your Interest",
                            content = """Thank you for showing interest in Ascend Viral!
    """.trimMargin()
                        ),
                        Template(
                            title = "Exploring Ascend Viral",
                            content = """Thank you for taking the time to explore Ascend Viral!""".trimMargin()
                        ),

                        Template(
                            title = "Prioritizing Your Concerns",
                            content = """Thank you for your understanding! 
    |I will prioritize sending you an email as soon as possible to address your concerns.""".trimMargin()
                        ),

                        Template(
                            title = "Further Assistance",
                            content = """Perfect! If you need any further assistance, feel free to reach out. 
    |Thanks for chatting with us, [client's name]!""".trimMargin()
                        ),

                        Template(
                            title = "Appreciation & Support",
                            content = """Okay, sounds good. Thank you again, [client's name]! 
    |We would be delighted to assist you again whenever you need our services. :)""".trimMargin()
                        ),

                        Template(
                            title = "Offering Help",
                            content = """Let me know if there's anything else I can help you with!""".trimMargin()
                        ),

                        Template(
                            title = "Excitement to Work Together",
                            content = """Thank you! I appreciate it. :) 
    |We are excited to work with you as well. Have a wonderful evening!""".trimMargin()
                        ),

                        Template(
                            title = "Encouragement for Further Inquiries",
                            content = """Please don't hesitate to reach out if you have any further inquiries or require additional support.""".trimMargin()
                        ),

                        Template(
                            title = "Gratitude for Trying Ascend Viral",
                            content = """Thanks for trying Ascend Viral. 
    |We would love to have you back whenever you decide to return.""".trimMargin()
                        ),

                        Template(
                            title = "Acknowledging Contact",
                            content = """Thank you for reaching out.""".trimMargin()
                        ),

                        Template(
                            title = "Expressing Interest in Ascend Viral",
                            content = """Thank you for reaching out to us and expressing your interest in Ascend Viral!""".trimMargin()
                        ),

                        Template(
                            title = "Valuing Feedback",
                            content = """Thank you for providing your feedback. 
    |We highly value it, and our team will investigate the matter thoroughly.""".trimMargin()
                        )
                    )
                ),
                SubCategory(
                    id = 402,
                    name = "Buying time (when you can't answer something)",
                    templates = listOf(
                        Template(
                            title = "Waiting for Information",
                            content = """Thanks for your patience! 
    |Unfortunately, I don’t have access to this information right now, but I’ll get back to you via email soon :)""".trimMargin()
                        ),

                        Template(
                            title = "Verifying with Manager",
                            content = """Let me double-check this with my manager to ensure I have the correct information. 
    |I’ll email you soon with an update!""".trimMargin()
                        ),

                        Template(
                            title = "Reviewing the Issue",
                            content = """Thanks for bringing this to my attention! 
    |I’ll review it further and email you an update as soon as possible.""".trimMargin()
                        ),

                        Template(
                            title = "Looking into the Issue",
                            content = """I’m currently looking into this for you. 
    |I’ll follow up with you via email shortly!""".trimMargin()
                        ),

                        Template(
                            title = "Forwarded to the Relevant Team",
                            content = """Your issue has been forwarded to the relevant team. 
    |I'll get back to you by email once it's fixed!""".trimMargin()
                        )
                    )
                ),
                SubCategory(
                    id = 403,
                    name = "Apologizing for any issues",
                    templates = listOf(
                        Template(
                            title = "Growth Assistant Unavailable",
                            content = """I apologize, but it seems that your current growth assistant is not available online at the moment. 
    |I’ve made a note for them to prioritize this as soon as they’re online!""".trimMargin()
                        ),

                        Template(
                            title = "Apology for Delay",
                            content = """We sincerely apologize for any inconvenience caused by this delay. 
    |It is highly unusual for us, and we appreciate your understanding.""".trimMargin()
                        ),

                        Template(
                            title = "Delayed Response Apology",
                            content = """Apologies for the delayed response.""".trimMargin()
                        ),

                        Template(
                            title = "Encouraging Retention",
                            content = """Please let us know if there is anything we can do to convince you to stay. 
    |We'll be happy to assist you. Your feedback will help us provide better service in the future.""".trimMargin()
                        ),

                        Template(
                            title = "Instagram Page Purpose",
                            content = """Our Instagram page is strictly for research purposes. 
    |We're not actively growing or posting on it, as our focus is on delivering the best results for our clients.""".trimMargin()
                        ),

                        Template(
                            title = "Customer Dissatisfaction Apology",
                            content = """We apologize once again for any dissatisfaction caused, as this is not the experience we aim to provide to our customers. 
    |Your feedback is valuable to us as it helps us improve our services.""".trimMargin()
                        ),

                        Template(
                            title = "Request for Customer Feedback",
                            content = """Hi there,  
    |Thank you for reaching out to us. I'm sorry to hear that you're disappointed with our service.  
    |I understand how frustrating it can be when expectations are not met, and I'd like to assist you in resolving this issue as quickly as possible.  
    |
    |To better understand your specific concerns and gather valuable feedback, could you please provide more details about what happened?  
    |Your input will be valuable in improving our service and addressing any issues you encountered.""".trimMargin()
                        ),

                        Template(
                            title = "Account Closure Consideration",
                            content = """We apologize to hear that you are considering closing your Ascend Viral account.  
    |We value your satisfaction and would like to know if there is anything we can do to persuade you to stay.  
    |Our team is here to assist you and ensure your experience is positive.  
    |
    |Your feedback is essential to us as it allows us to improve our services in the future.""".trimMargin()
                        ),

                        Template(
                            title = "Appreciation for Patience",
                            content = """We sincerely apologize for any inconvenience this may have caused,  
    |and we greatly appreciate your patience throughout this process.""".trimMargin()
                        ),

                        Template(
                            title = "Commitment to Customer Satisfaction",
                            content = """I apologize once again for the inconvenience caused.  
    |This is not typical of our service, and we are committed to addressing any issues to ensure a positive experience for our customers.""".trimMargin()
                        ),

                        Template(
                            title = "Acknowledging Customer Feedback",
                            content = """We appreciate your feedback and apologize for falling short of your expectations.  
    |Your input is valuable to us, and we will use it to improve our support and services.""".trimMargin()
                        ),

                        Template(
                            title = "Striving for Better Customer Support",
                            content = """Thank you for taking the time to share your experience with us.  
    |We strive to deliver exceptional customer support, and we apologize for any shortcomings you encountered.  
    |Your feedback will help us enhance our service and ensure better assistance in the future.""".trimMargin()
                        ),

                        Template(
                            title = "Apology for Inconvenience & Appreciation",
                            content = """We apologize for any inconvenience this may have caused,  
    |and we sincerely appreciate your support as a valued member of the Ascend Viral community.""".trimMargin()
                        )
                    )
                ),
                SubCategory(
                    id = 404,
                    name = "How to's",
                    templates = listOf(
                        Template(
                            title = "Canceling Your Subscription",
                            content = """To cancel your subscription, please follow these steps:
    |
    |1. Go to the Members Area: https://ascendviral.com/members-area/
    |2. Select "My Profile Management".
    |3. Click "Membership" on the left panel.
    |4. Find and click the "Cancel" button on the right.""".trimMargin()
                        ),

                        Template(
                            title = "Downloading Your Invoice",
                            content = """To download your invoice, please follow these steps:
    |
    |1. Go to the Members Area: https://ascendviral.com/members-area/
    |2. Select "My Profile Management".
    |3. On the left panel, click "Membership".
    |4. Choose "Payments".
    |5. Find the invoice you need and click the PDF button on the right to download it.""".trimMargin()
                        ),

                        Template(
                            title = "Updating Billing Information",
                            content = """To update your billing information, please follow these steps:
    |
    |1. First, access your Members Area by clicking this link: https://ascendviral.com/members-area/
    |2. Once you're logged in, select "My Profile Management" from the main menu.
    |3. In the left-hand panel, click on "Membership", and update your payment details there.""".trimMargin()
                        ),

                        Template(
                            title = "Accessing Messages & Assistant Dashboard",
                            content = """To access your messages and assistant dashboard, follow these steps:
    |
    |1. Go to the Members Area: https://ascendviral.com/members-area/
    |2. Click on "Instagram Growth".
    |3. Next, select "Assistant Dashboard".
    |4. From the left-hand panel, click "Messages" to view your messages.
    |
    |If the steps above don’t work, you can directly access your messages here: https://assistant.ascendviral.com/messages""".trimMargin()
                        ),

                        Template(
                            title = "Whitelisting an Account",
                            content = """To whitelist an account, please follow these steps:
    |
    |1. Go to the control panel on the left side of your dashboard screen, or follow this link: https://assistant.ascendviral.com/control
    |2. Choose the account you want to add to the whitelist, and click on the bullet list with a green check mark under "Whitelist".
    |3. Add any account to the whitelist by typing the username and clicking on the small arrow next to it.
    |4. [IMPORTANT] Scroll down and hit "Update" to save the changes.""".trimMargin()
                        ),

                        Template(
                            title = "Retrieving 2FA Recovery Codes",
                            content = """To get your 2FA recovery codes, please follow these steps:
    |
    |1. Open the Instagram app.
    |2. Go to your profile and tap on the "Hamburger icon".
    |3. Navigate to: Settings → Accounts Center → Password Security → Two-Factor Authentication → username → Additional Methods → Backup Codes.
    |4. Tap on "Get New Codes".""".trimMargin()
                        )
                    )
                ),
                SubCategory(
                    id = 405,
                    name = "Links",
                    templates = listOf(
                        Template(
                            title = "Members Area",
                            content = """Access your Members Area here:  
    |https://ascendviral.com/members-area/""".trimMargin()
                        ),

                        Template(
                            title = "Control Panel",
                            content = """Manage your account settings here:  
    |https://assistant.ascendviral.com/control""".trimMargin()
                        ),

                        Template(
                            title = "Onboarding Form",
                            content = """Fill out your growth strategy form here:  
    |https://assistant.ascendviral.com/onboarding""".trimMargin()
                        ),

                        Template(
                            title = "Dashboard",
                            content = """Access your account dashboard here:  
    |https://assistant.ascendviral.com/dashboard""".trimMargin()
                        ),

                        Template(
                            title = "Messages",
                            content = """View and respond to messages here:  
    |https://assistant.ascendviral.com/messages""".trimMargin()
                        ),

                        Template(
                            title = "Account Analytics",
                            content = """Check your account analytics here:  
    |https://analytics.ascendviral.com/accounts""".trimMargin()
                        ),

                        Template(
                            title = "Start Your Trial",
                            content = """Begin your free trial here:  
    |https://ascendviral.com/start-your-trial/""".trimMargin()
                        ),

                        Template(
                            title = "Start Instantly",
                            content = """Purchase a subscription instantly here:  
    |https://ascendviral.com/start-instantly/""".trimMargin()
                        ),

                        Template(
                            title = "Starter Trial",
                            content = """Start your Starter Growth trial here:  
    |https://ascendviral.com/start/starter-growth""".trimMargin()
                        ),

                        Template(
                            title = "Turbo Trial",
                            content = """Start your Turbo Growth trial here:  
    |https://ascendviral.com/start/turbo-growth""".trimMargin()
                        ),

                        Template(
                            title = "Starter Subscription",
                            content = """Subscribe to the Starter Growth plan here:  
    |https://ascendviral.com/start/go-starter""".trimMargin()
                        ),

                        Template(
                            title = "Turbo Subscription",
                            content = """Subscribe to the Turbo Growth plan here:  
    |https://ascendviral.com/start/go-turbo""".trimMargin()
                        )
                    )
                ),
                SubCategory(
                    id = 406,
                    name = "Canceling",
                    templates = listOf(
                        Template(
                            title = "Canceling Your Subscription",
                            content = """To cancel your subscription, please follow these steps:
    |
    |1. Go to the Members Area: https://ascendviral.com/members-area/
    |2. Select "My Profile Management".
    |3. Click "Membership" on the left panel.
    |4. Find and click the "Cancel" button on the right.""".trimMargin()
                        ),

                        Template(
                            title = "Request for Account Email",
                            content = """Can you please provide me with the email associated with your Ascend Viral account?""".trimMargin()
                        ),

                        Template(
                            title = "Forwarded Request",
                            content = """I have forwarded your request to the assigned team, and we will respond to you within the next 24-48 hours.""".trimMargin()
                        ),

                        Template(
                            title = "Subscription Cancellation Request Processed",
                            content = """Of course! I’ve forwarded your request to the appropriate team, and we’ll notify you via email as soon as your subscription has been canceled.""".trimMargin()
                        ),

                        Template(
                            title = "Subscription Canceled but Active Until Expiry",
                            content = """Please note that your subscription has been canceled, but it will remain active until the expiration date.""".trimMargin()
                        ),

                        Template(
                            title = "Acknowledging Subscription Cancellation",
                            content = """We're sorry to hear that you have decided to cancel your Ascend Viral subscription.""".trimMargin()
                        ),

                        Template(
                            title = "Request for Cancellation Feedback",
                            content = """We would greatly appreciate it if you could let us know the reason for your cancellation. 
    |Your feedback is valuable to us as it helps us improve our services for the future.""".trimMargin()
                        ),

                        Template(
                            title = "No Commitment Required",
                            content = """We appreciate your interest in our services. 
    |I want to assure you that our services are commitment-free, and we do not require you to sign a contract. 
    |You have the freedom to cancel your subscription anytime you wish.""".trimMargin()
                        ),

                        Template(
                            title = "Cancellation and Refund Processed",
                            content = """We have processed the cancellation and refund of your subscription. 
    |Please note that it may take 5-10 days for the refunded amount to appear on your statement, depending on the processing time of your bank.  
    |We apologize for any inconvenience this may have caused, and we appreciate your support as a valued member of the Ascend Viral community.""".trimMargin()
                        )
                    )
                ),
                SubCategory(
                    id = 407,
                    name = "Refunding or processing chargebacks",
                    templates = listOf(
                        Template(
                            title = "Refund Request Information",
                            content = """To begin filling out the refund request, 
    |can you please provide me with the email you signed up with and the reason for your dissatisfaction?""".trimMargin()
                        ),

                        Template(
                            title = "Refund Request Forwarded",
                            content = """Your refund request has been forwarded to the relevant team, 
    |and we’ll get back to you via email within the next 24-48 hours.""".trimMargin()
                        ),

                        Template(
                            title = "Offering a Free Month Instead of a Refund",
                            content = """We truly apologize for the inconvenience caused. 
    |Would you be open to receiving a free month of service instead of a refund? 
    |Please let us know what works best for you!""".trimMargin()
                        ),

                        Template(
                            title = "Refund Request Forwarded & Cancellation Assistance",
                            content = """Your refund request has been forwarded to the relevant team, 
    |and we’ll get back to you via email within the next 24-48 hours.  
    |In the meantime, would you like some assistance with how to cancel your subscription?""".trimMargin()
                        ),

                        Template(
                            title = "Refund Processed Notification",
                            content = """We are pleased to inform you that a refund has been processed for your account.  
    |Please note that the time it takes for the refund to reflect in your bank account may vary 
    |and can typically take anywhere from 5 to 10 business days, depending on the processing time of your bank.  
    |We apologize for any inconvenience this may have caused, and we sincerely appreciate your support 
    |as a valued member of the Ascend Viral community.""".trimMargin()
                        ),

                        Template(
                            title = "Refund & Free Month Policy",
                            content = """Please note that processing a refund or offering a free month of service 
    |will make you ineligible for future refunds or compensations if you choose to stay with our service.""".trimMargin()
                        ),

                        Template(
                            title = "Request for Additional Feedback",
                            content = """I'm genuinely sorry to hear that you're dissatisfied with our service.  
    |I understand your frustration, and I want to assure you that your experience matters to us.  
    |Your feedback is valuable, and we'd like to know more about the specific issues you've encountered  
    |so we can address them promptly. Could you please share more details or any particular concerns you have?""".trimMargin()
                        )
                    )
                ),
                SubCategory(
                    id = 408,
                    name = "Phone support",
                    templates = listOf(
                        Template(
                            title = "No Call Support Available",
                            content = """Unfortunately, we are a small team and we don't offer call support in order to keep our prices down.  
    |However, I'd be more than happy to help you with any questions you have via email or this live chat.  
    |Our live chat is available 24/6 for your convenience!  
    |Please let me know what questions you have, and I'll do my best to assist you.""".trimMargin()
                        )
                    )
                ),
                SubCategory(
                    id = 409,
                    name = "Working hours and weekend support",
                    templates = listOf(
                        Template(
                            title = "Growth Assistant Response Time",
                            content = """Your personal growth assistant will review all the information you provided and get back to you as soon as possible.  
    |Please keep in mind that our team usually takes Sundays off, and since it is past our Saturday hours,  
    |you may not hear back until Monday. If you don't receive a response by late Monday,  
    |please hop on the live chat and let me know.""".trimMargin()
                        ),

                        Template(
                            title = "Subscription Processing Time",
                            content = """Please note that the system may take up to 12 hours to process subscriptions.  
    |If you do not gain access after this period, feel free to reach out to us via live chat, and we'll assist you promptly.""".trimMargin()
                        ),

                        Template(
                            title = "Weekend Availability",
                            content = """While Sunday is typically our universal rest day, we do work on Saturdays.""".trimMargin()
                        )
                    )
                ),
                SubCategory(
                    id = 410,
                    name = "Chat support",
                    templates = listOf(
                        Template(
                            title = "Client Communication & Messaging System",
                            content = """Our communication with clients primarily occurs through our messaging system on the dashboard.  
    |You can easily interact with your personal growth assistant by visiting:  
    |https://assistant.ascendviral.com/messages  
    |They will be able to assist you promptly and address any questions or issues you may have.""".trimMargin()
                        )
                    )
                ),
                SubCategory(
                    id = 411,
                    name = "Growth assistants",
                    templates = listOf(
                        Template(
                            title = "VPN Login for Location Accuracy",
                            content = """Regardless of our global offices, your personal growth assistant will log in using a VPN near your current location as closely as possible.""".trimMargin()
                        ),

                        Template(
                            title = "Recommended Instagram Usage Time",
                            content = """Your growth assistant typically works on your account between 10 PM and 8 AM CST.  
    |During this time, it's ideal if you can avoid using the Instagram app.  
    |However, apart from that timeframe, you are free to use the app as you wish.""".trimMargin()
                        ),

                        Template(
                            title = "Consulting Your Growth Assistant",
                            content = """For specific information about your account, it's best to consult your personal growth assistant,  
    |as they can provide a more detailed explanation based on your account's needs.""".trimMargin()
                        ),

                        Template(
                            title = "Growth Assistant Location & VPN Usage",
                            content = """Most of our personal growth assistants are from Asia and North Africa.  
    |We use a VPN to log in to your account, ensuring that the location of logins reflects your general location.""".trimMargin()
                        )
                    )
                )
            )
        ),
        Category(
            id = 5,
            name = "Security and privacy",
            subCategories = listOf(
                SubCategory(
                    id = 501,
                    name = "Keeping customer accounts active, private and secure",
                    templates = listOf(
                        Template(
                            title = "Compliance with Instagram's Terms",
                            content = """Engaging in follow-unfollow spam violates Instagram's Terms of Service.  
    |However, we do not engage in spamming. Instead, we effectively interact with your community  
    |in a meaningful way to attract more visitors to your profile.  
    |Ultimately, it is your profile and content that will convince users to hit that follow button and give them a reason to stay. :)""".trimMargin()
                        ),

                        Template(
                            title = "Daily Follow/Unfollow Actions",
                            content = """We carry out approximately 150-200 actions (follow/unfollow) every day.  
    |This number aligns with Instagram's maximum limit to avoid action blocks.  
    |As a result, we charge our clients on a monthly basis to ensure consistent growth.""".trimMargin()
                        ),

                        Template(
                            title = "Manual Growth Process",
                            content = """No, our service is completely manual. We do not use bots or automation.  
    |Our team of growth assistants performs all the activities on real devices, ensuring compliance with Instagram's rules and guidelines.""".trimMargin()
                        ),

                        Template(
                            title = "Instagram Guidelines Compliance",
                            content = """As long as you adhere to Instagram's guidelines and avoid posting content  
    |that violates their policies, there is no need to worry about your account getting banned.""".trimMargin()
                        ),

                        Template(
                            title = "Ensuring 100% Compliance",
                            content = """We prioritize compliance with Instagram's guidelines,  
    |and all our methods are designed to be 100% compliant.""".trimMargin()
                        ),

                        Template(
                            title = "No Risk of Account Flagging",
                            content = """Rest assured that there are no risks of your account getting flagged by Instagram when using our service.""".trimMargin()
                        ),

                        Template(
                            title = "Growth Assistant Security",
                            content = """Our team of growth assistants are all in-house employees,  
    |and we have a strong track record of maintaining the security and integrity of our clients' accounts.""".trimMargin()
                        ),

                        Template(
                            title = "Manual Growth Without Automation",
                            content = """At Ascend Viral, we take pride in providing real growth without resorting to bots or automation.  
    |We have never had any account bans because we strictly adhere to Instagram's rules and guidelines.  
    |Our service is entirely manual, and you will be assigned a personal growth assistant  
    |who will engage with users interested in your niche on a dedicated device located near you, using a VPN for enhanced security.""".trimMargin()
                        ),

                        Template(
                            title = "Understanding Instagram Growth Services",
                            content = """We understand that finding a genuine Instagram growth service can be challenging,  
    |and we appreciate your due diligence in researching different options.  
    |To assist you in making an informed decision, we have published two articles on our website:
    |
    |The Truth About Instagram Growth Services:  
    |https://ascendviral.com/the-sad-truth-about-99-of-instagram-growth-services/
    |
    |How to Pick the Right Instagram Growth Service:  
    |https://ascendviral.com/how-to-pick-the-right-instagram-growth-service/
    |
    |Additionally, we have a video comparing different growth services that you may find helpful:  
    |https://youtu.be/Yx7EimOORao""".trimMargin()
                        ),

                        Template(
                            title = "Privacy & Security Commitment",
                            content = """Rest assured, we prioritize the privacy and security of our clients' accounts.  
    |As a USA-based company, we have stringent measures in place to protect your information.""".trimMargin()
                        ),

                        Template(
                            title = "Password Requirement for Growth Service",
                            content = """Yes, we do require a password.  
    |Most services that don't require a password usually send fake followers,  
    |and we focus on building authentic relationships through a manual follow/unfollow process.""".trimMargin()
                        ),

                        Template(
                            title = "Trust & Integrity in Our Business",
                            content = """Trust and integrity are the pillars of our business.  
    |We have been in this industry for a long time without any issues,  
    |and our commitment to maintaining your account's security remains unwavering.""".trimMargin()
                        ),

                        Template(
                            title = "Direct Message Privacy",
                            content = """Your privacy is of utmost importance to us.  
    |We do not access or interfere with your direct messages (DMs),  
    |respecting the confidentiality of your conversations.""".trimMargin()
                        ),

                        Template(
                            title = "Password Security & Encryption",
                            content = """We understand your concerns about sharing your password,  
    |but in order to provide our growth service, we do require access to your account.  
    |
    |Please be assured that we take the privacy and security of our clients very seriously.  
    |As a USA-based company, we adhere to strict security protocols  
    |and employ industry-standard encryption to safeguard your information.  
    |
    |We have a proven track record of maintaining the privacy and security of our clients' accounts without any incidents.  
    |Your trust and satisfaction are of utmost importance to us.  
    |
    |If you have any further questions or concerns, please don't hesitate to let us know.  
    |We're here to assist you.""".trimMargin()
                        ),

                        Template(
                            title = "Data Encryption & Protection",
                            content = """We utilize the highest form of encryption during our processes to safeguard your data.  
    |Rest assured that your password and personal information will be handled with the utmost care and confidentiality.""".trimMargin()
                        )
                    )
                ),
                SubCategory(
                    id = 502,
                    name = "2-factor authentication",
                    templates = listOf(
                        Template(
                            title = "Re-enabling 2FA",
                            content = """Once we log in, you can re-enable 2FA (Two-Factor Authentication).  
    |Make sure you share some backup codes with your assistant though!""".trimMargin()
                        ),

                        Template(
                            title = "Sharing 2FA Codes with Your Assistant",
                            content = """You can securely share your 2FA codes with your personal growth assistant  
    |through the messages section on our platform:  
    |https://assistant.ascendviral.com/messages  
    |
    |To find your 2FA codes, follow these steps:
    |1. Open the Instagram app.
    |2. Go to your profile and tap on the 'Hamburger icon'.
    |3. Navigate to: Settings → Accounts Center → Password Security → Two-Factor Authentication → username → Additional Methods → Backup Codes.
    |4. Tap on "Get New Codes".""".trimMargin()
                        )
                    )
                ),
                SubCategory(
                    id = 503,
                    name = "Whitelisting",
                    templates = listOf(
                        Template(
                            title = "Whitelist for Current Followings",
                            content = """Your current following will also be added to the whitelist,  
    |ensuring that we do not interact with them.""".trimMargin()
                        ),

                        Template(
                            title = "Unfollowing Policy",
                            content = """We don't unfollow your current followings.  
    |We only unfollow those we specifically follow on your account.  
    |Your current following will be added to a whitelist.  
    |You can always add more to that whitelist as we progress with your account growth.""".trimMargin()
                        ),

                        Template(
                            title = "Whitelisting Old Followers",
                            content = """Yes, we can whitelist old followers.  
    |Make sure to message your personal growth manager, and he will take care of your requests.""".trimMargin()
                        ),

                        Template(
                            title = "Managing Whitelist & Blacklist",
                            content = """We won’t unfollow users you have personally followed prior to signing up with Ascend Viral.  
    |However, if you decide to personally follow people during our service,  
    |you should add them to our whitelist so they don’t accidentally get unfollowed.  
    |
    |Similarly, if there are specific users who you don’t want us to follow,  
    |you should add them to the blacklist.  
    |You can do this in the Control tab:  
    |https://assistant.ascendviral.com/control""".trimMargin()
                        )
                    )
                )
            )
        ),
        Category(
            id = 6,
            name = "Automation and bots",
            subCategories = listOf(
                SubCategory(
                    id = 601,
                    name = "Using bots",
                    templates = listOf(
                        Template(
                            title = "Manual Growth - No Automation",
                            content = """No, our service is completely manual.  
    |We do not use bots or automation.  
    |Our team of growth assistants performs all the activities on real devices,  
    |ensuring compliance with Instagram's rules and guidelines.""".trimMargin()
                        ),

                        Template(
                            title = "Ghost Followers Disclaimer",
                            content = """Unfortunately, ghost followers are something beyond our control.  
    |Occasionally, users may follow your account who are bots or become inactive over time.""".trimMargin()
                        ),

                        Template(
                            title = "Avoiding Automation with Our Service",
                            content = """It is generally not recommended to use any kind of automation in conjunction with our service.  
    |Previous automation practices, such as auto-liking, can potentially hinder your results  
    |due to increased restrictions from Instagram.""".trimMargin()
                        )
                    )
                ),
                SubCategory(
                    id = 602,
                    name = "Following too many users",
                    templates = listOf(
                        Template(
                            title = "Daily Follow/Unfollow Actions",
                            content = """We carry out approximately 150-200 actions (follow/unfollow) every day.  
    |This number aligns with Instagram's maximum limit to avoid action blocks.  
    |As a result, we charge our clients on a monthly basis to ensure consistent growth.""".trimMargin()
                        ),

                        Template(
                            title = "Setting a Follow Limit",
                            content = """You have the option to set a specific limit on the number of people you want to follow at any given time.  
    |We generally recommend keeping it between 2,500-3,500,  
    |as this allows us to create optimal activity levels and sustainable growth for your account.""".trimMargin()
                        ),

                        Template(
                            title = "Recommended Follow Cap",
                            content = """We recommend keeping your following capped at 2,500 plus your initial following number (whitelist)  
    |to maintain optimal growth and account safety.  
    |If you’d like, you can request an unfollow session to remove everyone  
    |a few days before your subscription expires.""".trimMargin()
                        )
                    )
                )
            )
        ),
        Category(
            id = 7,
            name = "Technical support",
            subCategories = listOf(
                SubCategory(
                    id = 701,
                    name = "Troubleshooting bugs",
                    templates = listOf(
                        Template(
                            title = "Account Visibility in Dashboard",
                            content = """Sometimes it may take up to 24 hours for accounts to appear in the dashboard,  
    |especially during weekends when the processing time may be longer.  
    |Once your account shows up in the dashboard, your growth assistant  
    |will reach out to you through our messaging platform at:  
    |https://assistant.ascendviral.com/messages""".trimMargin()
                        ),

                        Template(
                            title = "Acknowledging Feedback",
                            content = """Thank you for providing your feedback.  
    |We highly value it, and our team will investigate the matter thoroughly.""".trimMargin()
                        ),

                        Template(
                            title = "Request Forwarded",
                            content = """I have forwarded your request to the appropriate team,  
    |and we will respond to you within the next 24-48 hours.""".trimMargin()
                        )
                    )
                ),
                SubCategory(
                    id = 702,
                    name = "Developer issues",
                    templates = listOf(
                        Template(
                            title = "Forwarded to Development Team",
                            content = """I have forwarded your concern to our development team,  
    |and they will look into it soon!""".trimMargin()
                        ),

                        Template(
                            title = "Ticket Escalated to Development Team",
                            content = """I have escalated your ticket to our development team, and I've given it a high priority.  
    |They will work on resolving the issue as quickly as possible.  
    |
    |Rest assured that we are actively working on a solution,  
    |and I will personally notify you as soon as the issue is fixed.""".trimMargin()
                        )
                    )
                ),
                SubCategory(
                    id = 703,
                    name = "Account bans / action blocks / issues",
                    templates = listOf(
                        Template(
                            title = "Instagram Restriction & Cooldown Advice",
                            content = """Occasionally, Instagram adjusts its detection and restriction mechanisms for account activity.  
    |This is Instagram's way of telling you to "cool down" your account.  
    |
    |Based on previous instances of account blocks, it is best to refrain from using the Instagram app until the block is lifted.  
    |Attempting to bypass the block could prolong the "action blocked" period.  
    |
    |We will also run the account through a brief warm-up cycle as a precautionary measure.""".trimMargin()
                        ),

                        Template(
                            title = "Recaptcha & Verification Process",
                            content = """We have temporarily paused all activity on our end.  
    |
    |You should be able to tap on the "Disagree with decision" button,  
    |and then Instagram will prompt you to do a recaptcha.  
    |After completing the recaptcha, Instagram will ask you to verify your email and phone number.  
    |Once you have done that, you should regain access to your account.""".trimMargin()
                        ),

                        Template(
                            title = "Recent Instagram Update Impact",
                            content = """It appears that Instagram has recently rolled out an update  
    |that has affected a small percentage of accounts, including some of our clients.  
    |
    |This update has caused temporary suspensions and prompts for verification.  
    |It seems to have affected both accounts using a growth service and those that are not.  
    |Even Instagram's main account, @instagram, experienced a sudden drop in followers, which is unusual.""".trimMargin()
                        ),

                        Template(
                            title = "False Flag Suspension",
                            content = """It appears that this suspension was a false flag and a temporary issue.  
    |We assure you that we prioritize the security of your account  
    |and would never engage in any activities that compromise your trust.""".trimMargin()
                        ),

                        Template(
                            title = "Compliance with Instagram’s Terms of Service",
                            content = """Rest assured that our methods are fully compliant with Instagram's terms of service.  
    |We log into your account using real devices and perform all activities manually.""".trimMargin()
                        ),

                        Template(
                            title = "No Suspensions Due to Our Methods",
                            content = """We have never had an account suspended solely due to the activities we perform.  
    |Our methods are 100% compliant with Instagram's guidelines.""".trimMargin()
                        )
                    )
                ),
                SubCategory(
                    id = 704,
                    name = "Delayed response",
                    templates = listOf(
                        Template(
                            title = "Delayed Response Due to High Demand",
                            content = """We truly apologize for the delayed response.  
    |We've been experiencing higher than usual demand,  
    |and it took us a bit longer to address all inquiries.  
    |
    |Your patience is really appreciated,  
    |and I’ve made a note for your assistant to get back to you on priority as soon as they're online.""".trimMargin()
                        ),

                        Template(
                            title = "Account Appearance in Dashboard",
                            content = """Sometimes it may take up to 48 hours for accounts to appear in the dashboard,  
    |especially during weekends when the processing time may be longer.  
    |
    |Once your account shows up in the dashboard,  
    |your growth assistant will reach out to you through our messaging platform at:  
    |app.ascendviral.com/messages""".trimMargin()
                        ),

                        Template(
                            title = "Technical Issue Causing Delay",
                            content = """I sincerely apologize for the delayed response.  
    |I was handling some technical issues earlier, which caused the delay.  
    |
    |Thank you for your understanding, and I’m here to assist you with anything you need!""".trimMargin()
                        ),

                        Template(
                            title = "Day Off - Now Available to Assist",
                            content = """I apologize for the delayed response!  
    |We were on a day off yesterday, but I’m here now and ready to assist you with anything you need.  
    |
    |Thank you for your patience!""".trimMargin()
                        )
                    )
                ),
                SubCategory(
                    id = 705,
                    name = "Incorrect billing or charges",
                    templates = listOf(
                        Template(
                            title = "Payment Confirmation Timeframe",
                            content = """Kindly note that it may take up to 12 hours for our payment processor to confirm your payment.  
    |If access is not granted within this timeframe, please reach out,  
    |and I’ll be happy to assist further.""".trimMargin()
                        ),

                        Template(
                            title = "Billing Inquiry & Resolution",
                            content = """Thank you for reaching out!  
    |I apologize for any confusion regarding the billing or charges.  
    |I’ll look into the issue and get back to you with a resolution as soon as possible.  
    |We appreciate your patience!""".trimMargin()
                        ),

                        Template(
                            title = "Checking Billing Issue",
                            content = """I’m sorry to hear about the billing issue you’ve encountered.  
    |Please give me a moment to check the details,  
    |and I'll provide an update shortly.  
    |Thanks for your understanding!""".trimMargin()
                        ),

                        Template(
                            title = "Incorrect Charges - Forwarded to Billing Team",
                            content = """I apologize for the inconvenience caused by the incorrect charges.  
    |I’ve forwarded your inquiry to the billing team  
    |and will have an update for you within 24-48 hours.""".trimMargin()
                        )
                    )
                )
            )
        ),
        Category(
            id = 8,
            name = "Agency and business management",
            subCategories = listOf(
                SubCategory(
                    id = 801,
                    name = "Reseller or white-label options",
                    templates = listOf(
                        Template(
                            title = "Reseller Service & Pricing",
                            content = """Right now, we're offering a reseller service.  
    |We offer a discount of $135 per month per Turbo account (opposed to our normal price of $199 per month).  
    |We no longer offer a white label since we recently upgraded our analytics software.""".trimMargin()
                        ),

                        Template(
                            title = "Joining Our Agency Program",
                            content = """If you'd like to join our agency program,  
    |the first step is to purchase an initial Turbo subscription.  
    |You can use my $20 off coupon code [coupon] to get the initial subscription at a discounted price.  
    |
    |When you're ready to add more accounts, just let us know how many you'd like to add,  
    |and we'd be happy to provide you with our agency discount code.""".trimMargin()
                        )
                    )
                ),
                SubCategory(
                    id = 802,
                    name = "Reputation & AV details",
                    templates = listOf(
                        Template(
                            title = "Company Location",
                            content = """Our company is based in Omaha, Nebraska.""".trimMargin()
                        ),

                        Template(
                            title = "Company & Team Location",
                            content = """We are a US-based company,  
    |and most of our personal growth assistants are from Asia and North Africa.  
    |
    |Our live chat is available 24 hours a day, Monday through Saturday.""".trimMargin()
                        )
                    )
                ),
                SubCategory(
                    id = 803,
                    name = "Taxes / W9 form / NDAs",
                    templates = listOf(
                        Template(
                            title = "Tax Classification of Our Service",
                            content = """When it comes to taxes, our service should be considered as a product expense  
    |rather than an independent contractor or individual labor-based service.  
    |
    |It is similar to an internet subscription or a social media app subscription.  
    |We have not issued a W9 form in all the years we've been in business for any of our Instagram products or services.  
    |
    |Typically, our service is treated as a regular business expense and can be written off accordingly.""".trimMargin()
                        ),

                        Template(
                            title = "Custom Invoice Requests",
                            content = """We can create custom invoices for you!  
    |Just provide us with the details you'd like to include,  
    |and we'll be happy to generate the invoice accordingly.""".trimMargin()
                        ),

                        Template(
                            title = "VAT ID & Tax Information",
                            content = """Please note that U.S. companies do not have VAT IDs or numbers.  
    |Instead, they have TINs (Taxpayer Identification Numbers).  
    |
    |As a service-based company, we do not collect tax information, in accordance with the United States tax code.  
    |If we sold physical products, we would provide a TIN,  
    |but it's not compulsory for us to share our tax information with clients for services.  
    |
    |Thank you for understanding!""".trimMargin()
                        ),

                        Template(
                            title = "NDA Policy",
                            content = """Unfortunately, we do not sign NDAs as part of our standard operating procedures.  
    |Thank you for understanding!""".trimMargin()
                        )
                    )
                ),
                SubCategory(
                    id = 804,
                    name = "Ebook - Guides and courses",
                    templates = listOf(
                        Template(
                            title = "Difference Between Course & Growth Service",
                            content = """The two services are separate.  
    |The course is a do-it-yourself program where you learn and implement the growth strategies yourself.  
    |
    |On the other hand, the growth service is a done-for-you service  
    |where our team takes care of the growth strategies and actions on your behalf.""".trimMargin()
                        ),

                        Template(
                            title = "Free Instagram Course & Growth Guide",
                            content = """I would highly recommend checking out our free Instagram course available at:  
    |https://ascendviral.com/instagram-course/  
    |
    |It's a great resource to learn more about Instagram and its growth strategies.  
    |
    |If you're looking to dive deeper into Instagram growth,  
    |I recommend reading our comprehensive guide called "Instagram Domination."  
    |This guide covers everything you need to know about growing your Instagram presence effectively.  
    |
    |You can access it here: https://ascendviral.com/dominate/  
    |
    |Both the course and the guide will provide you with valuable insights and strategies  
    |to enhance your Instagram growth.""".trimMargin()
                        ),

                        Template(
                            title = "Ebook Update Guide",
                            content = """Here's a detailed guide that'll help you get the latest version of the ebook:  
    |https://www.ascendviral.com/ebook-update-tutorial/""".trimMargin()
                        ),

                        Template(
                            title = "Check Update Guide",
                            content = """Kindly check the update guide here:  
    |https://www.ascendviral.com/ebook-update-tutorial/""".trimMargin()
                        )
                    )
                )
            )
        ),
        Category(
            id = 9,
            name = "Reviews and Testimonials",
            subCategories = listOf(
                SubCategory(
                    id = 901,
                    name = "Client Reviews & Testimonials",
                    templates = listOf(
                        Template(
                            title = "Website Testimonials",
                            content = """We have testimonials from satisfied customers available on our website  
                    |that you can refer to.  
                    |However, we are unable to provide specific information about the accounts we are currently working on.""".trimMargin()
                        ),

                        Template(
                            title = "TrustPilot Reviews",
                            content = """While we are unable to share specific client information due to privacy concerns,  
                    |you can find testimonials from our satisfied customers on TrustPilot.  
                    |
                    |Here's a direct link:  
                    |https://www.trustpilot.com/review/ascendviral.com""".trimMargin()
                        ),

                        Template(
                            title = "Google Search for Reviews",
                            content = """If you search for "Ascend Viral reviews" on Google,  
                    |you should find numerous pages with reviews and feedback from our clients.""".trimMargin()
                        ),

                        Template(
                            title = "Client Privacy Policy",
                            content = """We understand your interest,  
                    |but we are unable to share specific names or accounts of the people we work with.  
                    |
                    |This is in line with our policy to respect the privacy and confidentiality of our clients.""".trimMargin()
                        )
                    )
                )
            )
        )
    )

    val offers = listOf(
        Offer(

            name = "Starter Growth Plan",

            price = "$139",

            details = """• 5-day free trial
        |• 150 to 600+ targeted followers monthly
        |• Personal growth assistant dedicated to your account
        |• Minimal content suggestions
        |• Basic targeting strategies
        |• Protected by our growth guarantee
        |• Basic support and general guidance""".trimMargin(),

            link = "https://ascendviral.com/pricing"

        ),

        Offer(

            name = "Turbo Growth Plan",

            price = "$199",

            details = """• 5-day free trial
        |• 300 to 1000+ targeted followers monthly
        |• Personal growth assistant dedicated to your account
        |• Monthly content strategy consultation
        |• Detailed content report typically by week 3
        |• Comprehensive, optimized targeting
        |• Personalized bio optimization, hashtags, posting strategies
        |• Advanced support (responses within 24-48 hours)
        |• Priority-level customer support
        |• Protected by our growth guarantee""".trimMargin(),

            link = "https://ascendviral.com/pricing"

        )
    )

    val coupons = listOf(
        // Growth Assistant Coupons
        Coupon(code = "ESHAVIP20", title = "$20 Off Monthly Subscription", details = "Get $20 off your monthly subscription. Valid as long as your subscription is active."),
        Coupon(code = "JAYVIP20", title = "$20 Off Monthly Subscription", details = "Get $20 off your monthly subscription. Valid as long as your subscription is active."),

// Support Team Coupons
        Coupon(code = "HENRYVIP20", title = "$20 Off Monthly Subscription", details = "Get $20 off your monthly subscription. Valid as long as your subscription is active."),
        Coupon(code = "ANDREAVIP20", title = "$20 Off Monthly Subscription", details = "Get $20 off your monthly subscription. Valid as long as your subscription is active."),
        Coupon(code = "AISHAVIP20", title = "$20 Off Monthly Subscription", details = "Get $20 off your monthly subscription. Valid as long as your subscription is active."),
        Coupon(code = "OLIVIAVIP20", title = "$20 Off Monthly Subscription", details = "Get $20 off your monthly subscription. Valid as long as your subscription is active."),
        Coupon(code = "ALEXVIP20", title = "$20 Off Monthly Subscription", details = "Get $20 off your monthly subscription. Valid as long as your subscription is active."),
        Coupon(code = "GEMMAVIP20", title = "$20 Off Monthly Subscription", details = "Get $20 off your monthly subscription. Valid as long as your subscription is active."),
        Coupon(code = "ALEXANDRIAVIP20", title = "$20 Off Monthly Subscription", details = "Get $20 off your monthly subscription. Valid as long as your subscription is active."),
        Coupon(code = "ISAACVIP20", title = "$20 Off Monthly Subscription", details = "Get $20 off your monthly subscription. Valid as long as your subscription is active."),

// YouTube Coupons
        Coupon(code = "GROW2025", title = "$10 Off Monthly Subscription", details = "Used in 'My Ascend Viral Review' YouTube video. Get $10 off your monthly subscription."),
        Coupon(code = "COURSE10", title = "$10 Off Monthly Subscription", details = "Used in 'How To Gain Followers on Instagram in 2025' YouTube course. Get $10 off your monthly subscription."),
        Coupon(code = "GOVIRAL", title = "$10 Off Monthly Subscription", details = "Used in 'Grow Your Business on Instagram in 2025' YouTube course. Get $10 off your monthly subscription."),

// Agency Coupon
        Coupon(code = "AGENCYRATE135", title = "Turbo Plan at $135", details = "Turbo plan reduced from $199 to $135 per month. Only valid starting from the second subscription if you have at least three active subscriptions. If subscriptions drop below three, price reverts to full."),

// Standard Coupon
        Coupon(code = "20-off", title = "$20 Off Monthly Subscription", details = "Standard $20 off coupon. Valid as long as your subscription is active.")
    )
}