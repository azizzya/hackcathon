import qrCodeImgPath from '@/shared/assets/thread-13090132-506909745012483037.png';
import profileImgPath from '@/shared/assets/thug.jpg';
import '@/shared/ui/shared.scss';
import './styles.scss';
export const ProfilePage: React.FC = () => {
	return (
		<div className='page-wrapper'>
			<div className='profile-page-grid'>
				<div className='profile-page-grid-item-upper'>
					<img
						className='profile-page-grid-item-upper-img'
						src={profileImgPath}
					/>

					<div className='profile-page-grid-item-upper-text-name'>
						Александр Романов
					</div>
					<div className='profile-page-grid-item-upper-text-login'>
						@friendly_thug
					</div>
				</div>
				<div className='profile-page-grid-item-lower'>
					<img
						className='profile-page-grid-item-lower-img'
						src={qrCodeImgPath}
					/>
				</div>
			</div>
		</div>
	);
};
