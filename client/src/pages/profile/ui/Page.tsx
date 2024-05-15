import qrCodeimage from '@/shared/assets/thread-13090132-506909745012483037.png';
import userProfileImg from '@/shared/assets/secretarev.jpg';
import '@/shared/ui/shared.scss';
import './styles.scss';
import UserProfileBody from './UserProfileBody';
export const ProfilePage: React.FC = () => {
	// const userProfileQuery = useUserProfile();

	return (
		<UserProfileBody
			firstname='Андрей'
			lastname='Секретарев'
			profileImg={userProfileImg}
			qrCodeImg={qrCodeimage}
			username='@asecretarev'
		/>
		// <div className='page-wrapper'>
		// 	{userProfileQuery.isLoading ? (
		// 		<div>Loading</div>
		// 	) : userProfileQuery.isError ? (
		// 		<div>Error</div>
		// 	) : userProfileQuery.data ? (
		// 	<UserProfileBody {...userProfileQuery.data}/> когда бек будет готов

		// 	) : (
		// 		<div></div>
		// 	)}
		// </div>
	);
	return (
		<div className='page-wrapper'>
		  <div className='profile-info'>
			<div className='profile-info-img'>
			  <img
				src={userProfileImg}
			  />
			</div>
			<div className='profile-info-text-name'>
			  Андрей Секретарев
			</div>
			<div className='profile-info-text-login'>
			  @asecretarev
			</div>
			<img
			  className='profile-qr'
			  src={qrCodeimage}
			/>
		  </div>
		</div>
	  );
};
